package com.heynas.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * <p> Description:  TestLocale </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestLocale {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println(Locale.getDefault());

        Locale[] locales = Locale.getAvailableLocales();

        for (int i = 0; i < locales.length; i++) {
            Locale locale = locales[i];
//            System.out.println(locale.getLanguage() + "_" + locale.getCountry());
            System.out.println(locale.getDisplayLanguage() + "_" + locale.getDisplayCountry());
        }
    }
}
