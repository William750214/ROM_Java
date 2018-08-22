package com.heynas.test;

import java.time.Month;
import java.util.EnumMap;
import java.util.Map;

/**
 * Description:  TestEnumMap<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestEnumMap {
    public static void main(String[] args) {
        Map map01 = new EnumMap(Month.class);

        map01.put(Month.JANUARY, "1月");
        map01.put(Month.FEBRUARY, "2月");
        map01.put(Month.MARCH, "3月");

        System.out.println(map01);

        System.out.println(map01.get(Month.FEBRUARY));
    }
}
