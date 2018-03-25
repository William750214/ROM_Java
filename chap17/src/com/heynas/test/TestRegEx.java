package com.heynas.test;

/**
 * <p> Description:  TestRegEx </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestRegEx {
    public static void main(String[] args) {
        String str01 = "a1b2 c3d 4e5f6g7中";
        String str02 = "a123456789b";

        String str03 = "teacher";
        String str04 = "doctor";

        String str05 = "a1b2c3d4e5f6g7";

        String str06 = "a2222222222222222b";
        String str07 = "a8888888888888b";
        String str08 = "teachera8888888888888b";

        System.out.println(str01.matches("(\\w\\d)*"));
        System.out.println(str01.replaceAll("\\d", "*"));
        System.out.println(str01.replaceFirst("\\d", "*"));

        String[] strs = str01.split("\\d");
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
//            System.out.println(str);
        }

        System.out.println(str01.replaceAll("a", "*"));
        System.out.println(str01.replaceAll("\\x61", "*"));
        System.out.println(str01.replaceAll("中", "*"));
        System.out.println(str01.replaceAll("\u5685", "*"));

        System.out.println(str01.replaceAll("[abc]", "*"));
        System.out.println(str01.replaceAll("[a-c]", "*"));
        System.out.println(str01.replaceAll("[^abc]", "*"));
        System.out.println(str01.replaceAll(".", "*"));

        System.out.println(str01.replaceAll("\\d", "*"));
        System.out.println(str01.replaceAll("\\D", "*"));
        System.out.println(str01.replaceAll("\\s", "*"));
        System.out.println(str01.replaceAll("\\S", "*"));
        System.out.println(str01.replaceAll("\\w", "*"));
        System.out.println(str01.replaceAll("\\W", "*"));

        System.out.println(str02.replaceAll("a\\d{2,5}", "*"));
        System.out.println(str02.replaceAll("a\\d{2,}", "*"));
        System.out.println(str02.replaceAll("a\\d{2}", "*"));

        System.out.println(str02.replaceAll("a\\d?", "*"));
        System.out.println(str02.replaceAll("a\\d+", "*"));
        System.out.println(str02.replaceAll("a\\d*", "*"));

        System.out.println(str02.replaceAll("a\\d{2,5}?", "*"));
        System.out.println(str02.replaceAll("a\\d{2,}?", "*"));

        System.out.println(str02.replaceAll("a\\d??", "*"));
        System.out.println(str02.replaceAll("a\\d+?", "*"));
        System.out.println(str02.replaceAll("a\\d*?", "*"));

        System.out.println(str03.matches("[a-zA-Z]+(er|or)"));
        System.out.println(str04.matches("[a-zA-Z]+(er|or)"));

        System.out.println(str05.matches("([a-zA-Z]\\d)+"));

        System.out.println(str06.matches("a\\d+b"));

        System.out.println(str06.matches("a(\\d)\\1*b"));
        System.out.println(str07.matches("a(\\d)\\1*b"));

        System.out.println(str08.matches("[a-zA-Z]+(?:er|or)a(\\d)\\1*b"));

        String str10 = "1a123423b8";
        String str11 = "This is a regular-expression.";
        String str12 = "teacher";
        String str13 = "teacher22222";

        String str14 = "unable";
        String str15 = "888unable";


        System.out.println(str10.matches("^[a-zA-Z].*"));
        System.out.println(str10.matches(".*[a-zA-Z]$"));

        System.out.println(str11.replaceAll("\\b[a-zA-Z]+\\b","word"));

        System.out.println(str12.replaceAll("^[a-zA-Z]+(?=er)","*"));
        System.out.println(str13.replaceAll("^[a-zA-Z]+(?!er)","*"));

        System.out.println(str14.replaceAll("(?<=un)[a-zA-Z]+","*"));
        System.out.println(str15.replaceAll("(?<!un)[a-zA-Z]+","*"));


    }
}
