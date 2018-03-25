package com.heynas.Test;

import com.heynas.enums.Week;

/**
 * Description:  TestEnum
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestEnum {
	public static void main(String[] args) {
		String strDay = "Monday";
		Week day = Week.Sunday;
//		System.out.println(Week.Saturday instanceof Week);

		switch (day) {
			case Monday:
				System.out.println("Monday");
				break;
			default:
				System.out.println();
		}

//		System.out.println(Week.Monday.compareTo(Week.Sunday));
//		System.out.println(Week.Monday.compareTo(Week.Thursday));
//		System.out.println(Week.Monday.compareTo(Week.Monday));

//		System.out.println(Week.Monday.ordinal());
//		System.out.println(Week.Tuesday.ordinal());
//		System.out.println(Week.Wednesday.ordinal());
//		System.out.println(Week.Thursday.ordinal());
//		System.out.println(Week.Friday.ordinal());
//		System.out.println(Week.Saturday.ordinal());
//		System.out.println(Week.Sunday.ordinal());

//		System.out.println(Week.Monday.name());
//		System.out.println(Week.Tuesday.name());
//		System.out.println(Week.Wednesday.name());
//		System.out.println(Week.Thursday.name());
//		System.out.println(Week.Friday.name());
//		System.out.println(Week.Saturday.name());
//		System.out.println(Week.Sunday.toString());

//		day.setIndex(10);
//		day.setChineseName("星期一");
//		System.out.println(day.getIndex());
//		System.out.println(day.getChineseName());

		System.out.println(day.name());
		System.out.println(day.getChineseName());
		System.out.println(day.getIndex());
	}
}
