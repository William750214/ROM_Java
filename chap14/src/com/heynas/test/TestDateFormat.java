package com.heynas.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * <p> Description:  TestDateFormat </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
//        DateFormat df = DateFormat.getDateInstance();
//        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
//        DateFormat df = DateFormat.getTimeInstance();
//        DateFormat df = DateFormat.getDateTimeInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();

        System.out.println(sdf.format(date));

        System.out.println(sdf.parse("2017-08-27 09:10:26"));
    }
}
