package heynas.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> Description:  TestGeneric </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestGeneric {
    public static void main(String[] args) {
//        List<String> lst = new ArrayList<String>();
//        List<String> lst = new ArrayList();
//        List<String> lst = new ArrayList<>();

        List<String> lst = new ArrayList<>();

        lst.add("a");
        lst.add("b");
        lst.add("c");
//        lst.add(888);

        String str1 = lst.get(0);
        String str2 = lst.get(1);
        String str3 = lst.get(2);

        Generic<Integer, Integer> generic = new Generic();

        generic.setT(888);

        Integer integer = generic.getT();

        System.out.println(integer);

        TestList<Integer> testList = new TestList();
        testList.add(888888);
//        testList.add("aaa");

        Integer integer1 = (Integer) testList.get(0);

        System.out.println(integer1);

    }
}
