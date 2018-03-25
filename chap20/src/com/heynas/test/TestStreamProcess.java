package com.heynas.test;

import java.util.ArrayList;
import java.util.List;
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
public class TestStreamProcess {
    public static boolean isPass(Integer n) {
        if (n >= 60) {
            return true;
        } else {
            return false;
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

//        stream01.filter(TestStreamProcess::isPass).forEach(n -> {
//            System.out.println(n);
//        });

//        stream01.sorted((a,b) -> {
//            if (a > b) {
//                return -1;
//            } else if (a < b) {
//                return  1;
//            } else {
//                return 0;
//            }
//        }).forEach(n -> {
//            System.out.println(n);
//        });

//        stream01.distinct().sorted().forEach(n -> {
//            System.out.println(n);
//        });

//        stream01.limit(3).sorted().forEach(n -> {
//            System.out.println(n);
//        });

//        stream01.skip(5).sorted().forEach(n -> {
//            System.out.println(n);
//        });

        stream01.map(n -> {
            if (n < 60) {
                return "No Pass";
            } else {
                return "Pass";
            }
        }).forEach(n -> {
            System.out.println(n);
        });
    }
}
