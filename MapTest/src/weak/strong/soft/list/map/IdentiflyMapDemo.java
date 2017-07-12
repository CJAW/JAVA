package weak.strong.soft.list.map;

import java.util.IdentityHashMap;

/**
 * IdentiyHashMap 的使用：比较的是地址，可以去重。
 * @author user
 *
 */

public class IdentiflyMapDemo {

	public static void main(String[] args) {

		IdentityHashMap<String, String> map = new IdentityHashMap<String, String>();
		
		map.put("aa", "d");
		map.put("aa", "ddd");
		map.put("a", "ddd");

		map.put(new String("aa"), "ddd");
		map.put(new String("aa"), "ddd");
		System.out.println(map.get("aa"));
		System.out.println(map.size());
	}

}
