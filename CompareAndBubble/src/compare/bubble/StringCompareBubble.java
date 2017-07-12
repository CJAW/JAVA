package compare.bubble;

import java.util.ArrayList;
/**
 * 字符串的冒泡排序
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.rmi.CORBA.Util;

public class StringCompareBubble {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("asd");
		list.add("a");
		list.add("aa");
		list.add("asdad");

		sortFinal(list);

		System.out.println(list);
	}

	public static void sortFinal(List list) {
		Object[] arr = list.toArray();
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			list.set(i, arr[i]);
		}

	}

	public static void sort(Object[] arr) {

		boolean sore = true;

		for (int j = 0; j < arr.length - 1; j++) { // 趟数

			sore = true;

			for (int i = 0; i < arr.length - 1 - j; i++) { // 减次数

				if (((Comparable) arr[i]).compareTo(arr[i + 1]) > 0) {

					String temp;
					temp = (String) arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					sore = false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if (sore) {
				break;
			}
		}

	}

}
