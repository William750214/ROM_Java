package com.heynas.thread;

import java.util.HashMap;

/**
 * <p> Description:  PrintNumberThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
//public class PrintNumberThread extends Thread {
public class PrintNumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

//            new HashMap().get("abc").toString();

//            Thread.yield();

            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
        ;
    }
}
