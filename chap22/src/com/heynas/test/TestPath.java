package com.heynas.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * <p> Description:  TestPath </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestPath {
    public static void main(String[] args) {
//        Path path = Paths.get("d:/temp");
//        Path path = Paths.get("d:", "temp", "tmp");
        Path path = Paths.get(".");

        System.out.println(path.toAbsolutePath().getNameCount());
        System.out.println(path.toAbsolutePath().getName(0));
        System.out.println(path.toAbsolutePath().getName(1));
        System.out.println(path.toAbsolutePath().getName(2));
        System.out.println(path.toAbsolutePath().getName(3));
        System.out.println(path.toAbsolutePath().getName(4));
        System.out.println(path.toAbsolutePath().toFile().getAbsolutePath());


    }
}
