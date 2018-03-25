package com.heynas.test;

import java.util.*;

/**
 * <p> Description:  TestMap </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("zhangsan",100);
        map.put("lisi",90);
        map.put("wangwu",80);
        map.put("maliu",70);

        map.forEach((key,value) -> {
            System.out.println(key + ":" + value);
        });

        Set<String> keySet = map.keySet();

        for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
    }
}
