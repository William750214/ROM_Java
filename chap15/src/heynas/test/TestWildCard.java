package heynas.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p> Description:  TestWildCard </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestWildCard {
    private static void test01(List<? extends Number> lst) {

        Number number = lst.get(0);
    }

    private static void test02(List<? super Timestamp> lst) {

        Date date = (Date) lst.get(0);
    }

    public static void main(String[] args) {

        List<String> lst01 = new ArrayList<>();
        List<Integer> lst02 = new ArrayList<>();
        List<Long> lst03 = new ArrayList<>();
        List<Date> lst04 = new ArrayList<>();

//        test01(lst01);
        test01(lst02);
        test01(lst03);

//        test02(lst01);
//        test02(lst02);
//        test02(lst03);
        test02(lst04);
    }
}
