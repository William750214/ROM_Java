package com.heynas.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * <p> Description:  TestDateTimeFormatter </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestDateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(DateTimeFormatter.ISO_DATE.format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime));

        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").format(localDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.LONG).format(localDateTime));

        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println(LocalDateTime.parse("2017-08-27T09:28:16.414",DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
