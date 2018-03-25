package com.heynas.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:  TestCompareArrayLinedList<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestCompareArrayLinedList {
	public static void main(String[] args) {
//		List lst01 = new ArrayList();
		List lst01 = new LinkedList();



		for (int i = 0; i < 1000000; i++) {
			lst01.add(888);
		}

		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			lst01.get(100);
		}

		long end = System.currentTimeMillis();

		System.out.println("Costs = " + (end - start) + " ms.");
	}
}
