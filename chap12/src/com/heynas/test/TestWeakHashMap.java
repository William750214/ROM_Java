package com.heynas.test;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Description:  TestWeakHashMap<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestWeakHashMap {
	public static void main(String[] args) {
		Map map01 = new WeakHashMap();

		String str01 = new String("20");

		map01.put(new String("10"),"AAA");
		map01.put("30","CCC");
		map01.put(str01,"BBB");
		map01.put("50","DDD");
		map01.put("40","CCC");

		str01 = null;

//		System.gc();

		System.out.println(map01);
	}
}
