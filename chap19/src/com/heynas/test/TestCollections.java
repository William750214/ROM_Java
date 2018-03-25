package com.heynas.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <p> Description:  TestCollections </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestCollections {
    public static void main(String[] args) {
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

        for (int i = 0; i < lst.size(); i++) {
            Integer integer = lst.get(i);
            System.out.println(integer);
        }

        for (Iterator<Integer> iterator = lst.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        for (Integer i : lst) {
            System.out.println(i);
        }

        lst.forEach((i) -> {
            i = i + 1000;
            System.out.println(i);
        });

        Iterator<Integer> iterator = lst.iterator();

        iterator.forEachRemaining((i) -> {
            System.out.println(i);
        });

        lst.removeIf((i) -> {
            if (i < 60) {
                return true;
            } else {
                return false;
            }
        });

        System.out.println(lst);
    }
}
