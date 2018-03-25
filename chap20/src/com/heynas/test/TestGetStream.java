package com.heynas.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * <p> Description:  TestGetStream </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestGetStream {
    public static void main(String[] args) throws IOException {
        List<Integer> lst = new ArrayList();
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

        stream01.forEach(n -> {
            System.out.println(n);
        });

        Integer[] integers = new Integer[]{10, 20, 30, 40, 50, 60};

        Stream<Integer> stream02 = Arrays.stream(integers);

        stream02.forEach(n -> {
            System.out.println(n);
        });

        Stream<String> stream03 = Stream.of("zhangsan", "lisi", "wangwu");
        stream03.forEach(n -> {
            System.out.println(n);
        });

        System.out.println(Charset.defaultCharset());

        Stream<String> stream04 = Files.lines(Paths.get("d:/temp/abc_UTF8.txt"));
        stream04.forEach(n -> {
            System.out.println(n);
        });

    }
}
