package com.heynas.test;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Description:  TestIdentityHashMap<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestIdentityHashMap {
	public static void main(String[] args) {
		Map map01 = new IdentityHashMap();

		map01.put("10","AAA");
		map01.put("30","CCC");
		map01.put("20","BBB");
		map01.put("50","DDD");
		map01.put("40","CCC");

//		map01.put(new String("10"),"EEE");
		map01.put("10","EEE");

		System.out.println(map01);
	}
}
