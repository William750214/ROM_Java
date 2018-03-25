package com.heynas.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p> Description:  TestJava </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestJava {
    public static void main(String[] args) {
        String str01 = "a232bdsajf3dsafp888dsasffsa782ds333dfsp999f";
        String str02 = "a678b";

        Pattern pattern = Pattern.compile("p(\\d)\\1{2}");
//        Pattern pattern = Pattern.compile("^a\\d{3}b$");

        Matcher matcher = pattern.matcher(str01);

        System.out.println(matcher.groupCount());

        while (matcher.find()) {
            System.out.println(matcher.group(0) + " start:" + matcher.start() + " end:" + matcher.end());
            System.out.println(matcher.group(1) + " start:" + matcher.start() + " end:" + matcher.end());
        }

    }
}
