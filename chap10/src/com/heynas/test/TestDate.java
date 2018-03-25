package com.heynas.test;

import java.util.Date;
import java.util.TimeZone;

/**
 * Description:  TestDate<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestDate {
	public static void main(String[] args) {
		Date date01 = new Date();
		Date date02 = new Date();
//		System.out.println(date01);
//		System.out.println(date01.getTime());
//		System.out.println(System.currentTimeMillis());
//
//		System.out.println(new Date(System.currentTimeMillis()));
//
//		System.out.println(TimeZone.getDefault());

//		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));

//		Date date02 = new Date();
//		System.out.println(date02);
		System.out.println(date01);
		date01.setTime(date01.getTime() + 3600000 * 2);

		System.out.println(date01.before(date02));
		System.out.println(date01.after(date02));
		System.out.println(date01.before(date01));
		System.out.println(date01.after(date01));
		System.out.println(date01.equals(date01));
//		System.out.println(date01 > date02);

	}
}
