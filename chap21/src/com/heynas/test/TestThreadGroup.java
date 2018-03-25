package com.heynas.test;

import com.heynas.thread.MyThreadGroup;
import com.heynas.thread.PrintNumberThread;

/**
 * <p> Description:  TestThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestThreadGroup {
    public static void main(String[] args) {
        ThreadGroup tg = new MyThreadGroup("Group01");

        Runnable runnable = new PrintNumberThread();

        Thread thread0 = new Thread(tg, runnable);
//        Thread thread1 = new Thread(tg, runnable);

        thread0.start();
//        thread1.start();

//        System.out.println(tg.activeCount());
//        tg.interrupt();
    }
}
