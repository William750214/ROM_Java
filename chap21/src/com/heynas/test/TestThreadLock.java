package com.heynas.test;

import com.heynas.thread.SellTicketsLockThread;
import com.heynas.thread.SellTicketsThread;

/**
 * <p> Description:  TestThreadSync </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestThreadLock {
    public static void main(String[] args) {
        Runnable runnable = new SellTicketsLockThread();

        Thread thread1 = new Thread(runnable);
        thread1.setName("Window01");
        Thread thread2 = new Thread(runnable);
        thread2.setName("Window02");
        Thread thread3 = new Thread(runnable);
        thread3.setName("Window03");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
