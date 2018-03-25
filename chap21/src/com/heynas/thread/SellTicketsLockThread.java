package com.heynas.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <p> Description:  SellTicketsThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class SellTicketsLockThread implements Runnable {
//    private Lock lock = new ReentrantLock();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

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

            Lock lock = readWriteLock.writeLock();

            try {
                if(lock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        setTickets();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Lock Failure!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
