package com.heynas.test;

/**
 * Description:  TestStringBuilder<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		String str1 = "str1 ";
		String str2 = "str2 ";
		String str3 = "str3 ";
		String str4 = "str4 ";
		String str5 = "str5 ";

//		System.out.println(str1 + str2 + str3 + str4 + str5);

		StringBuilder sb = new StringBuilder(str1);
		System.out.println(sb.capacity());
		sb.insert(0,"ABCDEABCDEABCDEABCDE");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
//
//		sb.append(str1).append(str2).append(str3).append(str4).append(str5);
//
//		System.out.println(sb);
//
//		sb.insert(0,"str0 ");
////		sb.insert(8,"str0 ");
//
//		System.out.println(sb);
//
//		sb.replace(0,5,"ABC");
//
//		System.out.println(sb);
//
//		System.out.println(sb.reverse());
//
////		System.out.println(sb);
//
//		System.out.println(sb.capacity());

		sb.setLength(500);

		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.capacity());






	}
}
