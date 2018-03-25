package com.heynas.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p> Description:  SharedPool </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class SharedConditionPool {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private int size = 20;
    private int count = 0;

    public void produce() throws InterruptedException {
        lock.lock();

        try {
            if (count >= size) {
                condition.await();
            }

            count++;
            System.out.println("Produced one, Current count is " + count);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();

        try {
            if (count <= 0) {
                condition.await();
            }

            count--;
            System.out.println("Consumed one, Current count is " + count);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
