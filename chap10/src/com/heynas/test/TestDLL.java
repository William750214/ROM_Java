package com.heynas.test;

/**
 * Description:  TestDLL<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestDLL {
	public static void main(String[] args) {
//		System.load("C:\\Windows\\System32\\vbscript.dll");

		System.loadLibrary("vbscript");

		System.out.println("Continued!");

//		System.setOut();

		System.out.println(System.getProperty("java.library.path"));

		System.err.println("ABC");



	}
}
