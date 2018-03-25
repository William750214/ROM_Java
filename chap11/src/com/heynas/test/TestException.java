package com.heynas.test;

/**
 * Description:  TestException<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestException {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3};

		try {

			System.out.println(arr[3]);

			System.out.println("Try continue!");

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("ArithmeticException Handled!");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Exception Handled!");
		} finally {
			System.out.println("Resources Released!");
		}

		System.out.println("End");

	}
}
