package com.heynas.thread;

import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * <p> Description:  ProduceThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class ProduceBlockingQueueThread implements Runnable {
    private BlockingQueue<String> bq;

    public ProduceBlockingQueueThread(BlockingQueue bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Random random = new Random();
                int sleep = random.nextInt(500);
                Thread.sleep(sleep);
                bq.put("abc");
                System.out.println("Produced one, Current count is " + bq.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
