package heynas.test;

/**
 * <p> Description:  FunctionalInterface </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    void test01();

    static void test02() {
    }


    default void test03() {
    }

}
