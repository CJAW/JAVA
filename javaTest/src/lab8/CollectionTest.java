package lab8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 项目名称：lab8 类名称：CollectionTest 类描述： 泛型、集合测试 创建人：潘正军 创建时间：2013-10-17 上午10:50:10
 * 修改人：Administrator 修改时间：2013-10-17 上午10:50:10 修改备注：
 * 
 * @version 1.0.0
 *
 */
public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s[] = { "Java泛型", "Set接口", "Map接口", "List接口", "应用", "与", "区别" };
		// Set接口的应用
		System.out.println("===========Set集合接口的应用start=============");
		Set<String> set = new HashSet<String>();
		// set.add("Java泛型");//向集合添加字符串，下同
		// set.add("Set接口");
		// set.add("List接口");
		// set.add("Map接口");
		// set.add("应用");
		// set.add("与");
		// set.add("区别");
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		set.remove("java泛型");//移除
		set.add("adda");//插入
		System.out.println("第一种输出方式,默认调用toString()方法输出:");
		System.out.println(set);// 第一种输出方式，默认调用toString方法输出。
		System.out.println("第二种输出方式，使用迭代器逐个遍历:");
		print(set);
		/*
		 * Iterator<String> it = set.iterator(); while (it.hasNext()) {//
		 * 第二种输出方式，使用迭代器逐个遍历 System.out.println(it.next()); }
		 */
		System.out.println("===========Set集合接口的应用end=============");
		// List接口的应用
		System.out.println("**************List集合接口的应用start***************");
		List<String> al = new ArrayList<String>();
		// al.add("Java泛型");//向集合添加字符串，下同
		// al.add("Set接口");
		// al.add("List接口");
		// al.add("Map接口");
		// al.add("应用");
		// al.add("与");
		// al.add("区别");
		for (int i = 0; i < s.length; i++) {
			al.add(s[i]);
		}

		al.remove(1);
		al.add(3, "c++");
		System.out.println("第一种输出方式,默认调用toString()方法输出:");
		System.out.println(al);// 第一种输出方式，默认调用toString方法输出。
		System.out.println("第二种输出方式，使用迭代器逐个遍历:");
		print(al);
		/*
		 * Iterator<String> it1 = al.iterator(); while (it1.hasNext()) {//
		 * 第二种输出方式，使用迭代器逐个遍历 System.out.println(it1.next()); }
		 */
		System.out.println("*****************List集合接口应用end***************");
		// Map接口应用
		System.out.println("###############Map集合接口的应用start#############");
		Map<Integer, String> map = new HashMap<Integer, String>();
		// map.put(1, "Java泛型");//向map中添加字符串，下同
		// map.put(2, "Set接口");
		// map.put(3, "List接口");
		// map.put(4, "Map接口");
		// map.put(5, "应用");
		// map.put(6, "与");
		// map.put(7, "区别");
		for (int i = 0; i < s.length; i++) {
			map.put(i + 1, s[i]);
		}

		map.remove(1);
		map.put(1, "c++");

		System.out.println("第一种输出方式,默认调用toString()方法输出:");
		System.out.println(map);// 第一种输出方式，默认调用toString方法输出。
		System.out.println("第二种输出方式，使用循环逐个遍历:");
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));// 第二种输出方式，使用迭代器逐个遍历
		}
		System.out.println("###############Map集合接口的应用end###############");
	}

	// 静态打印方法，可以通用
	static void print(Collection<String> c) {
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
