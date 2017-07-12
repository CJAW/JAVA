package tree_set;
import java.util.Comparator;
import java.util.TreeSet;

import TreeMap.Person;

/**
 * 普通容器无法直接排序，要使用工具类collections提供的sort方法和comparator来排序。
 * 
 * TreeSet 容器可以直接排序。
 * 
 * 要在放入数据时排序，因此要实现一个排序方法。
 * @author user
 *
 */

public class TreeSetDemo{

	public static void main(String[] args) {

		Person p1 = new Person("aa", 100);
		Person p2 = new Person("bb", 20);
		Person p3 = new Person("cc", 40);

		TreeSet<Person> tree = new TreeSet<Person>(

		new Comparator<Person>() {

			public int compare(Person o1, Person o2) {

				return o1.getMoney() - o2.getMoney();
			}

		}

		);

		tree.add(p1);
		tree.add(p2);
		tree.add(p3);
		
		System.out.println(tree);
	}

}
