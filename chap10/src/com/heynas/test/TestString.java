package com.heynas.test;

import com.heynas.util.StringUtil;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * Description:  TestString<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = "Hello String";
		String str2 = "Hello String";

		String str3 = new String("Hello String");
		String str4 = new String("Hello String");

		String str5 = new String(str1);

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1 == str5);

		String str6 = "中";
		String str7 = "\u4E2D";

		System.out.println(str6 == str7);

		byte[] bytes = str6.getBytes(Charset.forName("GBK"));

//		String str8 = new String(bytes, Charset.forName("GBK"));

		String str8 = new String(bytes);

		System.out.println(str8);

		char[] chars = {'中', '国', '人', '民'};

		char char1 = '中';
		String str01 = "中";

		String str9 = new String(chars, 1, 2);

		System.out.println(str9);

//		System.out.println(Charset.defaultCharset());

		System.out.println(Charset.availableCharsets());

		String str11 = "Hello String,Hello String";

		System.out.println(str11.indexOf("String"));
		System.out.println(str11.indexOf('S'));
		System.out.println(str11.lastIndexOf("String"));
		System.out.println(str11.lastIndexOf('S'));

		System.out.println(str11.indexOf("String", 7));
		System.out.println(str11.indexOf('S', 7));

		System.out.println(str11.replace("String","Java"));
		System.out.println(str11.replace('S','J'));
		System.out.println(str11);

		System.out.println(str11.toLowerCase());
		System.out.println(str11.toUpperCase());

		System.out.println(str11.substring(6));
		System.out.println(str11.substring(6,8));

		String str12 = "   Hello String,Hello String    ";
		System.out.println(str12.trim());

		byte[] strBytes = str11.getBytes();
		char[] strChars = str11.toCharArray();

		Date date = new Date();

		System.out.println(date.toString());

		Date date1 = null;

		int num1 = 10;

		System.out.println(String.valueOf(date));
		System.out.println(String.valueOf(date1));

		System.out.println(String.valueOf(num1));

		String str13 = null;  //空对象
		String str14 = "";    //空字符串
		String str15 = " ";   //空格字符串

//		System.out.println(str13.length());
		System.out.println(str14.length());
		System.out.println(str15.length());

//		System.out.println(str13.isEmpty());

		System.out.println(StringUtil.isEmpty(str13));

		if (!StringUtil.isEmpty(str13)) {
			System.out.println(str13.length());
		} else {
			System.out.println("Null");
		}


		System.out.println("Continue...");


	}
}
