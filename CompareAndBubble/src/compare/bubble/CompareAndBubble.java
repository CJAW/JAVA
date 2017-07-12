package compare.bubble;

import java.util.Arrays;
/**
 * 
 * 最终版的冒泡排序
 *
 */
public class CompareAndBubble {

	public static void sort(int[] arr) {

		boolean sore = true; // 减趟数

		for (int j = 0; j < arr.length - 1; j++) { // 趟数

			sore = true;

			for (int i = 0; i < arr.length - 1 - j; i++) { // 减次数

				if (arr[i] < arr[i + 1]) {

					int temp;
					temp = arr[i + 1];
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

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 5, 8, 9 };

		sort(arr);

	}

}
