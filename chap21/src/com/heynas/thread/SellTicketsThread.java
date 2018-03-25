package com.heynas.thread;

import com.heynas.test.TestThreadSync;

/**
 * <p> Description:  SellTicketsThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class SellTicketsThread implements Runnable {
    private int tickets = 10;

    public synchronized void setTickets() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + " 卖票成功，还剩 " + --tickets + " 张！");
        } else {
            System.out.println("票已售完！");
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setTickets();

//            synchronized (SellTicketsThread.class) {
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + " 卖票成功，还剩 " + --tickets + " 张！");
//                } else {
//                    System.out.println("票已售完！");
//                }
//            }
        }


    }
}
