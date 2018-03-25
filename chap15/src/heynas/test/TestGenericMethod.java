package heynas.test;

import java.util.Date;
import java.util.List;

/**
 * <p> Description:  TestGenericMethod </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestGenericMethod {

    private static String test01(String str01,Integer int01) {
        return "";
    }

    private static <T,S> T test02(T t) {
        T t1 = null;
        return t;
    }

    private static <T> T getInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

//    private void test01(List<String> lst) {
//
//    }
//
//    private void test01(List<Integer> lst) {
//
//    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        String str = test02("888");
//        Integer str = test02(888);

        Date date  = getInstance(Date.class);
        String str  = getInstance(String.class);

        System.out.println(date);
        System.out.println(str);
    }
}
