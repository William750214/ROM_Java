package com.heynas.test;

import java.util.Locale;
import java.util.TimeZone;

/**
 * Description:  TestTimeZone<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestTimeZone {
	public static void main(String[] args) {
		System.out.println(TimeZone.getDefault());
//		TimeZone.setDefault(TimeZone.getTimeZone("GMT+09:00"));
//		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
//		System.out.println(TimeZone.getDefault());
//
//		String[] ids = TimeZone.getAvailableIDs();
//
//		for (int i = 0; i < ids.length; i++) {
//			String id = ids[i];
//			System.out.println(id);
//		}

		System.out.println(TimeZone.getDefault().getDisplayName(Locale.CANADA));

		System.out.println(TimeZone.getDefault().getRawOffset());

		TimeZone timeZone = TimeZone.getTimeZone("GMT+09:00");

		System.out.println(timeZone);

		timeZone.setID("GMT+08:00");
		timeZone.setRawOffset(28800000);

		System.out.println(timeZone);




	}
}
