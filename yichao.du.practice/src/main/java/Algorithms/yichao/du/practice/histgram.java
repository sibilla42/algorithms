package Algorithms.yichao.du.practice;

public class histgram {

	/**
	 * 接收一个整型数组a[]和一个整数M为参数并返回一个大小为M的数组， 其中第i个元素的值是整数i在参数数组中出现的次数。
	 * 如果a[]中得值均在0—M-1之间，返回数组中所有元素之和应该和a.length相等
	 * 
	 * @param a
	 * @param M
	 * @return
	 */
	public static int[] histgram(int[] a, int M) {
		int[] counter = new int[M];

		for (int i = 0; i < counter.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					counter[i]++;
				}
			}
		}

		return counter;
	}

	/**
	 * test
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = {3,3,0,2,1};
		int[] array = histgram(input, 5);
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum += array[i];
		}
		System.out.println("sum is: " + sum);
		System.out.println("a.length is: " + input.length);
	}
}
