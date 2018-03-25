package com.heynas.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Description:  TestExceptionMessage<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestExceptionMessage {
	public static void method01() throws FileNotFoundException {
		try {
			FileInputStream fileInputStream = new FileInputStream("d:\\abc.txt");
		} catch (FileNotFoundException e) {
//			e.fillInStackTrace();
			throw e;
		}

		System.out.println(Math.addExact(1999999999, 1999999999));

	}

	public static void method02() throws FileNotFoundException {
		method01();
	}

	public static void method03() throws FileNotFoundException {
		method02();
	}

	public static void method04(int a, int b) throws MyException, MyException1 {

		if (a > b) {
			throw new MyException();
		} else if (a < b) {
			throw new MyException1();
		} else {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		try {
			method03();
		} catch (FileNotFoundException e) {
//			e.fillInStackTrace();
			e.printStackTrace();

//			StackTraceElement[] stackTraceElements = e.getStackTrace();
//
//			for (int i = 0; i < stackTraceElements.length; i++) {
//				System.out.println(stackTraceElements[i]);
//			}

			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Runtime Exception!");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println();
		}

//		try {
//			method04(10, 20);
//		} catch (MyException e) {
//			e.printStackTrace();
//		} catch (MyException1 myException1) {
//			myException1.printStackTrace();
//		} catch (Exception ex1) {
//			ex1.printStackTrace();
//		}
	}
}
