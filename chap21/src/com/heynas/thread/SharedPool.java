package com.heynas.thread;

/**
 * <p> Description:  SharedPool </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class SharedPool {
    private int size = 20;
    private int count = 0;

    public synchronized void produce() throws InterruptedException {
        if (count >= size) {
            wait();
        }

        count++;
        System.out.println("Produced one, Current count is " + count);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        if (count <= 0) {
            wait();
        }

        count--;
        System.out.println("Consumed one, Current count is " + count);
        notifyAll();
    }
}
