package com.heynas.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:  TestHash<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestHash {
	public static void main(String[] args) {
		Map map01 = new HashMap();

		map01.put("10","AAA");
		map01.put("30","CCC");
		map01.put("20","BBB");
		map01.put("50","DDD");
		map01.put("401","CCC");
		map01.put("402","CCC");
		map01.put("403","CCC");
		map01.put("404","CCC");
		map01.put("42034","CCC");
		map01.put("4034","CCC");
		map01.put("404234","CCC");
		map01.put("40433234","CCC");
		map01.put("4043334","CCC");
		map01.put("40423334","CCC");
		map01.put("40423334","CCC");

		System.out.println(map01);
	}
}
