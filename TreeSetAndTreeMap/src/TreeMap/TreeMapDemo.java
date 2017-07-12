package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 普通容器无法直接排序，要使用工具类collections提供的sort方法和comparator来排序。
 * 
 * TreeSet 容器可以直接排序。
 * 
 * 要在放入数据时排序，因此要实现一个排序方法。
 * @author user
 *
 */


public class TreeMapDemo {
	
	public static void main(String[] args) {

		Person p1 = new Person("aa", 100);
		Person p2 = new Person("bb", 20);
		Person p3 = new Person("cc", 40);

		TreeMap<Person,String> tree = new TreeMap<Person,String>(

		new Comparator<Person>() {

			public int compare(Person o1, Person o2) {

				return o1.getMoney() - o2.getMoney();
			}

		}

		);

		tree.put(p1,"aaa");
		tree.put(p2,"ccc");
		tree.put(p3,"ddd");
		
		System.out.println(tree);
	}

}
