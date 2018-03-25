package com.heynas.test;

import java.util.*;

/**
 * Description:  TestHashMap<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestHashMap {
	public static void main(String[] args) {
		Map map01 = new LinkedHashMap();
//		Map map01 = new Hashtable();

		map01.put("AAA", 111);
		map01.put("BBB", 222);
		map01.put("CCC", 333);
//		map01.put(null, 444);

		System.out.println(map01);
		System.out.println(map01.get("BBB"));
		System.out.println(map01.isEmpty());
//		map01.clear();
		System.out.println(map01.isEmpty());
		System.out.println(map01.containsKey("DDD"));
		System.out.println(map01.containsKey("CCC"));
		System.out.println(map01.containsValue(888));
		System.out.println(map01.containsValue(333));

		Set entrySet = map01.entrySet();

//		for (Iterator iterator = entrySet.iterator(); iterator.hasNext(); ) {
//			Map.Entry entry = (Map.Entry) iterator.next();
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//
//		}

		Set keySet = map01.keySet();

//		for (Iterator iterator = keySet.iterator(); iterator.hasNext(); ) {
//			Object key = iterator.next();
//			System.out.println(key + " = " + map01.get(key));
//		}

		Collection values = map01.values();

		for (Iterator iterator = values.iterator(); iterator.hasNext(); ) {
			Object next = iterator.next();
			System.out.println(next);
		}


	}
}
