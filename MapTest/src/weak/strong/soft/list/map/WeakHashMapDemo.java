package weak.strong.soft.list.map;
/**
 * weakhashmap的使用与weakreference一样；
 */

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {

		WeakHashMap<String, String> map = new WeakHashMap<String, String>();

		map.put("aa", "ddd");

		map.put(new String("asd"), "ddad");

		System.out.println("回收前：" + map.get("aa"));

		System.gc();
		System.runFinalization();

		map.put("aa", null);

		System.out.println("回收后：" + map.get("aa"));
		System.out.println("回收后：" + map.size());

	}

}
