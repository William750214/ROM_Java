package com.heynas.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * <p> Description:  TestURLClassLoader </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestURLClassLoader {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        URL url = new URL("file:/D:/temp/");

        URLClassLoader urlClassLoader1 = new URLClassLoader(new URL[]{url});
        URLClassLoader urlClassLoader2 = new URLClassLoader(new URL[]{url});

        Class clazz1 = urlClassLoader1.loadClass("com.heynas.bean.TestObject");
        Object str1 = clazz1.newInstance();

        Class clazz2 = urlClassLoader2.loadClass("com.heynas.bean.TestObject");
        Object str2 = clazz2.newInstance();

        Class clazz3 = urlClassLoader2.loadClass("com.heynas.bean.TestObject");

        System.out.println(str1.getClass().getClassLoader());
        System.out.println(str2.getClass().getClassLoader());
    }
}
