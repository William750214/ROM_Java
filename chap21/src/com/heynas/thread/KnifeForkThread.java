package com.heynas.thread;

import java.util.Random;

/**
 * <p> Description:  KnifeForkThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class KnifeForkThread implements Runnable {
    private Object knife = new Object();
    private Object fork = new Object();

    @Override
    public void run() {
        Random random = new Random();
        boolean logic = random.nextBoolean();

        if (logic) {
            synchronized (knife) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " get Knife.");
                synchronized (fork) {
                    System.out.println(Thread.currentThread().getName() + " get fork.");
                    System.out.println(Thread.currentThread().getName() + " eat.");
                }
            }
        } else {
            synchronized (fork) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " get fork.");
                synchronized (knife) {
                    System.out.println(Thread.currentThread().getName() + " get knife.");
                    System.out.println(Thread.currentThread().getName() + " eat.");
                }
            }
        }
    }
}
