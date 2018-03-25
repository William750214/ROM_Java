package com.heynas.test;

import com.heynas.thread.ConsumeThread;
import com.heynas.thread.ProduceThread;
import com.heynas.thread.SharedPool;

/**
 * <p> Description:  TestProduceConsume </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestProduceConsume {
    public static void main(String[] args) {
        SharedPool sp = new SharedPool();

        Thread produce = new Thread(new ProduceThread(sp));
        Thread consume = new Thread(new ConsumeThread(sp));

        produce.start();
        consume.start();
    }
}
