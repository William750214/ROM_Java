package com.heynas.test;

import java.util.Random;

/**
 * Description:  TestRandom<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestRandom {
	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt());
//			System.out.println(random.nextDouble());
//			System.out.println(random.nextFloat());
//			System.out.println(random.nextBoolean());
		}
	}
}
