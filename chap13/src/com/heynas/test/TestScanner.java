package com.heynas.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <p> Description:  TestScanner </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestScanner {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new FileInputStream("d:\\temp\\abc_UTF8.txt"));
//        sc.useDelimiter(",");

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

        sc.close();
    }
}
