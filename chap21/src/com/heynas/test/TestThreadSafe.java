package com.heynas.test;

import com.heynas.thread.PrintListThread;
import com.heynas.thread.PrintMapThread;
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
public class TestThreadSafe {
    public static void main(String[] args) {
//        Runnable runnable = new PrintMapThread();
        Runnable runnable = new PrintListThread();

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
