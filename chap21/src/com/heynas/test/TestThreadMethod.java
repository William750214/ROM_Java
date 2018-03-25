package com.heynas.test;

import com.heynas.thread.PrintNumberThread;

/**
 * <p> Description:  TestThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new PrintNumberThread();

        Thread thread0 = new Thread(runnable);
//        thread0.setDaemon(true);
//        Thread thread1 = new Thread(runnable);

//        thread0.setName("T0");
//        thread1.setName("T1");

//        thread0.setPriority(Thread.MAX_PRIORITY);
//        thread1.setPriority(Thread.MIN_PRIORITY);

//        System.out.println(thread0.isAlive());
        thread0.start();

        thread0.interrupt();
//        thread0.join(1000);

//        thread1.start();

//        for (int i = 0; i < 999999; i++) {
//
//        }

//        System.out.println(thread0.isAlive());

        System.out.println("Main finished!");

    }
}
