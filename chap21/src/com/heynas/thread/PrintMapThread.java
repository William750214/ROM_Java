package com.heynas.thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p> Description:  PrintNumberThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class PrintMapThread implements Runnable {
//    private Map map = new HashMap();
//    private Map map = Collections.synchronizedMap(new HashMap());
    private Map map = new ConcurrentHashMap();
//    private Map map = new Hashtable();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            map.put(Thread.currentThread().getName() + " : " + i, i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + map.size());
    }
}
