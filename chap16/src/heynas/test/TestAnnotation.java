package heynas.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> Description:  TestAnnotation </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestAnnotation {
    @Deprecated
    @TestAnno(id = 888, description = "efg", sw = @SuppressWarnings(value = "unchecked"), strings = {"abc", "efg"})
    @TestAnno01
//    @Fkgs(fkgs = {@Fkg(name = "zhangsan"), @Fkg(name = "lisi")})
    @Fkg(name = "zhangsan")
    @Fkg(name = "lisi")
    @Fkg(name = "wangwu")
    public static void test01() {
        System.out.println("Test01");
    }

    private static <@TestAnno01 T> T getInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    @SuppressWarnings(value = "unchecked")
    public static void main(@TestAnno01 String[] args) {
//        test01();

//        Date date = new Date(2017,8,29);

//        System.out.println(date);

        List lst = new ArrayList();
        lst.add(888);
        lst.add("abc");
    }


    @SafeVarargs
    public static <T> T useVarargs(T... args) {
        return args.length > 0 ? args[0] : null;
    }

}
