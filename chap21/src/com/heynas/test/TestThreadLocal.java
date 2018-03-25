package com.heynas.test;

import com.heynas.thread.PrintNumberSumThread;

/**
 * <p> Description:  TestThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestThreadLocal {
    public static void main(String[] args) {
        Runnable runnable = new PrintNumberSumThread();

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread0.start();
        thread1.start();
    }
}
