package com.heynas.test;

import com.heynas.thread.*;

/**
 * <p> Description:  TestProduceConsume </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestConditionProduceConsume {
    public static void main(String[] args) {
        SharedConditionPool sp = new SharedConditionPool();

        Thread produce = new Thread(new ProduceConditionThread(sp));
        Thread consume = new Thread(new ConsumeConditionThread(sp));

        produce.start();
        consume.start();
    }
}
