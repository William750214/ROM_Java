package heynas.test;

import java.lang.reflect.Method;

/**
 * <p> Description:  TestReflect </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestReflect {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = TestAnnotation.class.getMethod("test01");

        TestAnno testAnno = method.getAnnotation(TestAnno.class);

        System.out.println(testAnno.id());
        System.out.println(testAnno.description());

        System.out.println(method.isAnnotationPresent(TestAnno.class));


    }
}
