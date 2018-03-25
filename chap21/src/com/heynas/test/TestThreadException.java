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
public class TestThreadException {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Caught Exception!!!");
            }
        });

        Runnable runnable = new PrintNumberThread();

        Thread thread0 = new Thread(runnable);
//        Thread thread1 = new Thread(runnable);

        thread0.start();
    }
}
