package com.heynas.thread;

import java.util.concurrent.Callable;

/**
 * <p> Description:  PrintNumberThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class PrintNumberCallableThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            Thread.yield();
            sum += i;
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

        return sum;
    }
}
