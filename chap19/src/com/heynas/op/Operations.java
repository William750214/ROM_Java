package com.heynas.op;

import java.io.FileNotFoundException;

/**
 * <p> Description:  Operations </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
@FunctionalInterface
public interface Operations<T> {
    T add(T a, T b);

//    int sub(int a, int b);
}
