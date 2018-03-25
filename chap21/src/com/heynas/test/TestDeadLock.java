package com.heynas.test;

import com.heynas.thread.KnifeForkThread;

/**
 * <p> Description:  TestDeadLock </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestDeadLock {
    public static void main(String[] args) {
        Runnable runnable = new KnifeForkThread();

        Thread thread1 = new Thread(runnable);
        thread1.setName("Customer A:");
        Thread thread2 = new Thread(runnable);
        thread2.setName("Customer B:");

        thread1.start();
        thread2.start();

    }
}
