/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package Algorithms.yichao.du.practice;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 
 * @author macbookpro
 * @version $Id: Fibonacci_v1.java, v 0.1 2015年8月15日 下午8:03:45 macbookpro Exp $
 */
public class Fibonacci_v1 {

	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(F(i));
		}
	}

}
