package com.heynas.test;

import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by William on 2017/6/10.
 */
public class Test {

    public static void main(String[] args) {
        Properties properties = System.getProperties();

        for (Iterator<Object> iterator = properties.keySet().iterator(); iterator.hasNext(); ) {
            Object next = iterator.next();
//            System.out.println(next);
        }
        System.out.println("A" + System.getProperty("line.separator") + "B");
    }
}
