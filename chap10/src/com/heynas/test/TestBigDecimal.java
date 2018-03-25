package com.heynas.test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Description:  TestBigDecimal<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestBigDecimal {
	public static void main(String[] args) {
		System.out.println(0.05 + 0.01);
		System.out.println(0.05 + 0.01 == 0.06);

		Double d01 = 0d;

		for (int i = 0; i < 1000000l; i++) {
			d01 += (0.05 + 0.01);
		}

		System.out.println(d01);

//		BigDecimal bd01 = new BigDecimal(d01);
		BigDecimal bd02 = BigDecimal.valueOf(d01);

		System.out.println(bd02);

		System.out.println("------------------------");

		BigDecimal result = BigDecimal.ZERO;

		for (int i = 0; i < 1000000l; i++) {
//			result.add(BigDecimal.valueOf(0.05).add(BigDecimal.valueOf(0.01)));
//			result = result.add(BigDecimal.valueOf(0.05).add(BigDecimal.valueOf(0.01)));
			result = result.add(new BigDecimal("0.05").add(new BigDecimal("0.01")));
		}

		System.out.println(result);

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100l; i++) {
			Math.pow(99999000000099.99999999,99999999);
//			BigDecimal.valueOf(99999000000099.99999999).pow(999);
		}

		long end = System.currentTimeMillis();
		System.out.println("Costs=" + (end - start));

		long l01 = 999999999999999998l;
		long l02 = 999999999999999998l;
		long l03 = 999999999999999998l;

		System.out.println(l02 * l01);


		BigInteger bi01 = BigInteger.valueOf(l01);
		BigInteger bi02 = BigInteger.valueOf(l02);
		BigInteger bi03 = BigInteger.valueOf(l03);

		System.out.println(bi01.multiply(bi02).multiply(bi03));

	}
}
