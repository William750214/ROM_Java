package com.heynas.test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Description:  TestScale<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestScale {
	public static void main(String[] args) {
		BigDecimal bd01 = BigDecimal.valueOf(123.441);
//
//		System.out.println(bd01.setScale(2,BigDecimal.ROUND_UP));
//		System.out.println(bd01.setScale(2,BigDecimal.ROUND_DOWN));
//		System.out.println(bd01.setScale(2,BigDecimal.ROUND_CEILING));
//		System.out.println(bd01.setScale(2,BigDecimal.ROUND_FLOOR));
//		System.out.println(bd01.setScale(2,BigDecimal.ROUND_HALF_UP));
//		System.out.println(bd01.setScale(2,BigDecimal.ROUND_HALF_DOWN));
//		System.out.println(bd01.setScale(2,BigDecimal.ROUND_HALF_EVEN));
//
//		System.out.println(bd01.setScale(2));

		MathContext mc = new MathContext(5, RoundingMode.UP);

		System.out.println(bd01.round(mc));

	}
}
