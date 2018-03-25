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
public class TestExceptionChain {
	public static void method01() {
		try {
			FileInputStream fileInputStream = new FileInputStream("d:\\abc.txt");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			SystemException systemException = new SystemException("AAA");
//			systemException.initCause(new ArithmeticException());
//			throw systemException;
			throw new SystemException("AAA",e);
		}
	}

	public static void method02() {
		method01();
	}

	public static void method03()  {
		method02();
	}

	public static void main(String[] args) {
		try {
			method03();
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e.getCause());
		}
	}
}
