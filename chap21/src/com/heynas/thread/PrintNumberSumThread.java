package com.heynas.thread;

/**
 * <p> Description:  PrintNumberThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class PrintNumberSumThread implements Runnable {
    private ThreadLocal<Integer> sum = new SumThreadLocal();

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            sum.set(sum.get() + i);
        }

        System.out.println(Thread.currentThread().getName() + " : " + sum.get());
    }
}
