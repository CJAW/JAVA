package hashmap.fengliang;
/**
 * Map 中一对多的思想
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		List<Student> list = exam();

		Map<String, ClassRoom> map = count(list);

		view(map);

	}

	public static void view(Map<String, ClassRoom> map) { // 遍历袋子取出需要的
		
		Set<String> keys = map.keySet();

		Iterator<String> keyit = keys.iterator();
		
		while (keyit.hasNext()) {
			String no = (String) keyit.next();
			ClassRoom room = (ClassRoom) map.get(no);

			double total = room.getTotal();
			double avg = total / room.getStud().size();
			System.out.println(no + "  " + total + "  " + avg);
		}
	}

	public static Map<String, ClassRoom> count(List<Student> list) { // 创建袋子

		Map<String, ClassRoom> map = new HashMap<String, ClassRoom>();

		for (Student stud : list) {

			String no = stud.getClassnum();

			double score = stud.getScore();
			
			ClassRoom room = map.get(no);

			if (room == null) {
				room = new ClassRoom();
				map.put(no, room);
			}

			room.getStud().add(stud);

			room.setTotal(room.getTotal() + score);

			map.put(no, room);

		}

		return map;
	}

	public static List<Student> exam() { // 存储人数

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("aa", 23, "a"));
		list.add(new Student("bb", 12, "a"));
		list.add(new Student("cc", 56, "b"));
		list.add(new Student("dd", 70, "b"));
		list.add(new Student("ee", 60, "b"));
		list.add(new Student("ff", 54, "c"));
		list.add(new Student("gg", 23, "c"));

		return list;

	}

}
