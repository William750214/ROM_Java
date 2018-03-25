package com.heynas.test;

import java.lang.reflect.Array;

/**
 * <p> Description:  TestArray </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestArray {
    public static void main(String[] args) {
        String[] students = (String[]) Array.newInstance(String.class, 10);

        Array.set(students, 0, "zhangsan");
        Array.set(students, 1, "lisi");
        Array.set(students, 2, "wangwu");
        Array.set(students, 3, "maliu");

        System.out.println(Array.get(students,0));
        System.out.println(Array.get(students,1));
        System.out.println(Array.get(students,2));
        System.out.println(Array.get(students,3));
    }
}
