package com.heynas.test;

/**
 * <p> Description:  TestMyClassLoader </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestMyClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = new MyClassLoader();

        Class clazz = classLoader.loadClass("java.util.Date");

        System.out.println(clazz.getClassLoader());
    }
}
