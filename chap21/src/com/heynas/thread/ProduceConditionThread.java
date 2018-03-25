package com.heynas.thread;

import java.util.Random;

/**
 * <p> Description:  ProduceThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class ProduceConditionThread implements Runnable {
    private SharedConditionPool sp;

    public ProduceConditionThread(SharedConditionPool sp) {
        this.sp = sp;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Random random = new Random();
                int sleep = random.nextInt(500);
                Thread.sleep(sleep);
                sp.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
