package com.heynas.thread;

import java.util.Random;

/**
 * <p> Description:  ConsumeThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class ConsumeThread implements Runnable {
    private SharedPool sp;

    public ConsumeThread(SharedPool sp) {
        this.sp = sp;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Random random = new Random();
                int sleep = random.nextInt(500);
                Thread.sleep(sleep);
                sp.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
