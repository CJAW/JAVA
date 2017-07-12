package lab8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	static Scanner str;

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("potobal", "马铃薯");
		map.put("peache", "桃子");
		map.put("pear", "雪梨");

		str = new Scanner(System.in);

		System.out.println("请输入：");

		String st = str.nextLine();

		Set<String> keys = map.keySet();

		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String key = it.next();

			if (st.equals(key)) {

				System.out.println(map.get(key));
				break;
			} else {
				System.out.println("无单词");
				break;
			}
		}

	}

}
