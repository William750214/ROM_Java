package com.heynas.test;

/**
 * <p> Description:  TestLoadClass </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestLoadClass {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        classLoader.loadClass("java.util.Date");
    }
}
