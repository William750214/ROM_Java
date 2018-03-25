package com.heynas.test;

import com.heynas.bean.Student;
import com.heynas.op.Operations;

import java.util.function.Supplier;

/**
 * <p> Description:  TestOperations </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestOperations {
    public int testAdd(int a, int b) {
        return a + b;
    }

    public static int Operate(int a, int b, Operations<Integer> operations) {
        return operations.add(a, b);
    }

    public static void testSuppiler(int a, int b, Supplier<Student> supplier) {
        System.out.println(supplier.get());
    }

    public static void main(String[] args) {
        int n = 1000;

        Operations<Integer> operations01 = (a, b) -> {
            return a + b + n;
        };

        Operations<Integer> operations02 = (a, b) -> {
            return a + b + 10;
        };

        Operations<Integer> operations03 = new TestOperations()::testAdd;


        System.out.println(operations01.add(3, 5));
        System.out.println(operations02.add(3, 5));
//        System.out.println(operations.sub(5, 3));

        System.out.println(Operate(3, 5, operations01));
        System.out.println(Operate(3, 5, operations02));


        System.out.println(operations03.add(3, 5));

        testSuppiler(3, 5, Student::new);
    }
}
