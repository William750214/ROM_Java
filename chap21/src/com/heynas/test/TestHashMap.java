package com.heynas.test;

import com.heynas.thread.PrintNumberThread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * <p> Description:  TestThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestHashMap {
    private static Queue lst = new ConcurrentLinkedQueue();
    private static Map map = Collections.synchronizedMap(new HashMap());

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000000; i++) {
                lst.add(i);
                map.put(i,i);
            }
        };

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread0.start();
        thread1.start();

        thread0.join(99999999999l);
        thread1.join(99999999999l);

        System.out.println(lst.size());
        System.out.println(map.size());
    }
}
