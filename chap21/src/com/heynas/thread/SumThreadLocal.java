package com.heynas.thread;

/**
 * <p> Description:  SumThreadLocal </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class SumThreadLocal extends ThreadLocal<Integer> {
    @Override
    protected Integer initialValue() {
        return 0;
    }
}
