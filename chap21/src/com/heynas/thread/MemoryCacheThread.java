package com.heynas.thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <p> Description:  MemoryCacheThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class MemoryCacheThread implements Runnable {
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private Map cacheMap = new ConcurrentHashMap();

    public Object get(String key) {
        readWriteLock.readLock().lock();
        try {
            return cacheMap.get(key);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void set(String key, Object value) {
        readWriteLock.writeLock().lock();
        try {
            cacheMap.put(key, value);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public void run() {

    }
}
