package com.heynas.test;

import com.heynas.util.MathUtil;

import java.math.BigInteger;

/**
 * Description:  TestMath<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestMath {
	public static void main(String[] args) {
		Double d1 = 234.23423;
		Double d2 = 234.23425;

		System.out.println(Math.max(d1,d2));
		System.out.println(Math.min(d1,d2));

		System.out.println(Math.round(d1));
		System.out.println(Math.ceil(d1));
		System.out.println(Math.floor(d1));

		System.out.println(Math.round(d1 * 100) * 1.0d / 100);

		for (int i = 0; i < 100; i++) {
			//1 <= result <= 100
			//0 <= random < 1
			//0 <= random * 100 < 100
//			System.out.println(Math.round(Math.floor(Math.random() * 100) + 1));
//			System.out.print(MathUtil.random(1L,10L) + " ");
//			System.out.print(MathUtil.random(3L,5L) + " ");
		}

		System.out.println(Math.E);
		System.out.println(Math.PI);

	}
}
