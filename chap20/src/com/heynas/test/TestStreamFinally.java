package com.heynas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * <p> Description:  TestStreamProcess </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestStreamFinally {
    public static boolean isPass(Integer n) {
        if (n >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static int Comparator(Integer a, Integer b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList();
        lst.add(80);
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        lst.add(60);
        lst.add(70);
        lst.add(80);
        lst.add(90);
        lst.add(100);

        Stream<Integer> stream01 = lst.stream();

//        stream01.forEach(n -> {
//            System.out.println(n);
//        });

//        stream01 = lst.stream();

//        Optional<Integer> minOpt = stream01.min(TestStreamFinally::Comparator);
//        System.out.println(minOpt.get());

//        boolean anyMatch = stream01.anyMatch(n -> {
//            if (n == 71) {
//                return true;
//            } else {
//                return false;
//            }
//        });
//        System.out.println(anyMatch);

        Optional<Integer> findAnyOpt = stream01.findAny();

        System.out.println(findAnyOpt.get());

    }
}
