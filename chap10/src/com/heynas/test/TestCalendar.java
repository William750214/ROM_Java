package com.heynas.test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Description:  TestCalendar<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestCalendar {
	public static void main(String[] args) {
		Date date1 = new Date();

		Calendar c01 = Calendar.getInstance();

		c01.setTime(date1);

		System.out.println(date1);

		c01.add(Calendar.YEAR,1);

		System.out.println(c01.getTime());

//		c01.add(Calendar.MONTH,3);
		c01.roll(Calendar.MONTH,3);

		System.out.println(c01.getTime());

		System.out.println(c01.get(Calendar.YEAR));
		System.out.println(c01.get(Calendar.MONTH) + 1);
		System.out.println(c01.get(Calendar.DAY_OF_MONTH));

		Calendar calendar02 = Calendar.getInstance();

//		calendar02.setLenient(false);

		calendar02.set(2018,25,1,8,8,8);

		System.out.println(calendar02.getTime());

		System.out.println(calendar02.getActualMaximum(Calendar.MONTH));
		System.out.println(calendar02.getActualMinimum(Calendar.MONTH));
		System.out.println(calendar02.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(calendar02.getActualMinimum(Calendar.DAY_OF_MONTH));

		System.out.println(calendar02);

		Calendar calendar03 = Calendar.getInstance(TimeZone.getTimeZone("GMT+09:00"));

		System.out.println("------------------------------------");
		System.out.println(calendar03.get(Calendar.HOUR_OF_DAY));


	}
}
