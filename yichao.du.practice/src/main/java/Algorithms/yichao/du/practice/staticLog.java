/**
 * 
 */
package Algorithms.yichao.du.practice;

import java.util.Scanner;

/**
 * @author yichao.du
 *
 */
public class staticLog {

	/**
	 * 接收整形参数N，返回不大于log2N的最大整数
	 * @return
	 */
	public static int lg() {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		return (int)Math.floor(Math.log(N)/Math.log(2));
	}
	
	
	/**
	 * test
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(lg());
	}

}
