package com.heynas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
public class TestCollector {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList();
        lst.add(30);
        lst.add(33);
        lst.add(40);
        lst.add(50);
        lst.add(60);
        lst.add(70);
        lst.add(80);
        lst.add(87);
        lst.add(90);
        lst.add(97);
        lst.add(98);
        lst.add(100);

        Stream<Integer> stream01 = lst.stream();

//        System.out.println(stream01.collect(Collectors.counting()));

//        System.out.println(stream01.collect(Collectors.minBy((a,b) -> {
//            if (a > b) {
//                return 1;
//            } else if (a < b) {
//                return -1;
//            } else {
//                return 0;
//            }
//        })).get());

//        System.out.println(stream01.collect(Collectors.summingInt(a -> {
//            return a;
//        })));

//        System.out.println(stream01.collect(Collectors.averagingInt(a -> a)));

//        System.out.println(stream01.collect(Collectors.summarizingInt(a -> a)));

//        System.out.println(stream01.map(a -> a.toString()).collect(Collectors.joining(",")));

//        System.out.println(stream01.collect(Collectors.reducing(Integer::sum)).get());

//        System.out.println(stream01.collect(Collectors.groupingBy(a -> {
//            if (a >= 60) {
//                return "及格";
//            } else {
//                return "不及格";
//            }
//        }, Collectors.groupingBy(a -> {
//            if (a % 2 ==0) {
//                return "偶数";
//            } else {
//                return "奇数";
//            }
//        }))));

//        System.out.println(stream01.collect(Collectors.groupingBy(a -> {
//            if (a >= 60) {
//                return "及格";
//            } else {
//                return "不及格";
//            }
//        }, Collectors.counting())));

        System.out.println(stream01.collect(Collectors.partitioningBy(a -> {
            if (a >= 60) {
                return true;
            } else {
                return false;
            }
        })));


    }
}
