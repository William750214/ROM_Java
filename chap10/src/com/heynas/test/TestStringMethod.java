package com.heynas.test;

/**
 * Description:  TestStringMethod<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestStringMethod {
	public static void main(String[] args) {
		String str01 = "Hello";
		String str02 = "你好";
		String str03 = " Java";
		String str04 = new String(" Java");

		System.out.println(str01.length());
		System.out.println(str02.length());

		System.out.println(str01.charAt(0));
		System.out.println(str02.charAt(0));
//		System.out.println(str02.charAt(10));

		System.out.println(str01.concat(str03));
		System.out.println(str01 + str03);
		System.out.println(str01);
		System.out.println(str03);

		System.out.println(str01.concat(str02).concat(str03));

		System.out.println(str01.join("------",str01,str02,str03));
		System.out.println(str01);

		System.out.println(str01.startsWith("He"));
		System.out.println(str01.startsWith("Ha"));
		System.out.println(str01.endsWith("lo"));
		System.out.println(str01.endsWith("lp"));

		System.out.println(str01.contains("el"));
		System.out.println(str01.contains("eL"));

		System.out.println(str03.equals(new StringBuffer(str04)));
		System.out.println(str03.contentEquals(str04));

		System.out.println(str03 == str04);
		System.out.println(str03.equals(str04));
		System.out.println(str03.equalsIgnoreCase(str04));

		System.out.println(str03.contentEquals(str04));

		System.out.println(str03.equals(new StringBuilder(str04)));
		System.out.println(str03.contentEquals(new StringBuilder(str04)));


		String str05 = "abcHelloefg";
		String str06 = "abcabcHellOefgefg";

		System.out.println(str05.regionMatches(true,3,str06,6,5));

		String str07 = "a";
		String str08 = "a";

		System.out.println(str07.compareTo(str08));
		System.out.println("中".compareTo("国"));


//		System.out.println("Continue...");
	}
}
