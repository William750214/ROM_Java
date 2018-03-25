package com.heynas.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.StampedLock;

/**
 * <p> Description:  SellTicketsThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class SellTicketsStampLockThread implements Runnable {
    private StampedLock stampedLock = new StampedLock();

    private int tickets = 10;

    public void setTickets() {
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

//            lock.lock();
//            try {
//                lock.lockInterruptibly();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            try {
//                setTickets();
//            } finally {
//                lock.unlock();
//            }

            long stamp = stampedLock.writeLock();

            try {
                setTickets();
            } finally {
                stampedLock.unlockWrite(stamp);
            }


        }


    }
}
