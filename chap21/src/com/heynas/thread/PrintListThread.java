package com.heynas.thread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * <p> Description:  PrintNumberThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class PrintListThread implements Runnable {
//    private List lst = new ArrayList();
//    private List lst = Collections.synchronizedList(new ArrayList());
//    private List lst = new Vector();
//    private Queue lst = new ConcurrentLinkedQueue();
    private List lst = new CopyOnWriteArrayList();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lst.add(Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + lst.size());
    }
}
