package com.heynas.test;

import java.util.Locale;

/**
 * Description:  TestLocale<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestLocale {
	public static void main(String[] args) {
//		Locale locale01 = new Locale()

		Locale[] locales = Locale.getAvailableLocales();

//		for (int i = 0; i < locales.length; i++) {
//			Locale locale = locales[i];
//			System.out.println(locale);
//		}

//		System.out.println(Locale.CHINESE);
//		System.out.println(Locale.CHINA);

//		System.out.println(Locale.getDefault());

//		Locale.setDefault(Locale.US);

//		System.out.println(Locale.getDefault());

		Locale locale01 = Locale.getDefault();

		System.out.println(locale01.getDisplayLanguage(Locale.US));
		System.out.println(locale01.getDisplayCountry(Locale.US));



	}
}
