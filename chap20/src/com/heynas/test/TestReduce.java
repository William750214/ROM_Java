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
public class TestReduce {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList();
        lst.add(50);
        lst.add(60);
        lst.add(70);
        lst.add(80);
        lst.add(90);
        lst.add(100);

        Stream<Integer> stream01 = lst.stream();

//        Integer sum = stream01.reduce(0, (a, b) -> {
//            return a + b;
//        });
//
//        System.out.println(sum);

        Optional<Integer> optional = stream01.reduce(Integer::sum);

        System.out.println(optional.get());

    }
}
