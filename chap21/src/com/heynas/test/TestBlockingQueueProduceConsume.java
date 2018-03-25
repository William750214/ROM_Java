package com.heynas.test;

import com.heynas.thread.*;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <p> Description:  TestProduceConsume </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestBlockingQueueProduceConsume {
    public static void main(String[] args) {

        BlockingQueue bq = new ArrayBlockingQueue(20);

        Thread produce = new Thread(new ProduceBlockingQueueThread(bq));
        Thread consume = new Thread(new ConsumeBlockingQueueThread(bq));

        produce.start();
        consume.start();
    }
}
