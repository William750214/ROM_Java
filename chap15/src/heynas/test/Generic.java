package heynas.test;

import java.util.ArrayList;

/**
 * <p> Description:  Generic </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class Generic<S, T extends Number> extends ArrayList<S> {
    private T t;
//    private static T p;

//    static {
//        T a;
//    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

//    public static T getTt() {
//        return t;
//    }
}
