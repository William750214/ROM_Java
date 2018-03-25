package com.heynas.test;

import com.heynas.bean.Person;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Description:  TestThreadLocalRandom<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestThreadLocalRandom {
	public static void main(String[] args) {
		ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

		for (int i = 0; i < 10; i++) {
			System.out.println(threadLocalRandom.nextInt());
		}
	}
}
