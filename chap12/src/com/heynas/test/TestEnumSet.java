package com.heynas.test;

import java.time.Month;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/**
 * Description:  TestEnumSet<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestEnumSet {
	public static void main(String[] args) {
		Set set01 = EnumSet.allOf(Month.class);
		Set set02 = EnumSet.noneOf(Month.class);
		Set set03 = EnumSet.copyOf(set01);
		Set set04 = EnumSet.complementOf((EnumSet)set03);

		List lst01 = new ArrayList();
		lst01.add(Month.JANUARY);
		lst01.add(Month.FEBRUARY);

		Set set05 = EnumSet.copyOf(lst01);
		Set set06 = EnumSet.complementOf((EnumSet)set05);
		Set set07 = EnumSet.range(Month.AUGUST,Month.NOVEMBER);
		Set set08 = EnumSet.of(Month.AUGUST,Month.NOVEMBER,Month.APRIL,Month.APRIL);

		System.out.println(set01);
		System.out.println(set02);
		System.out.println(set03);
		System.out.println(set04);
		System.out.println(set05);
		System.out.println(set06);
		System.out.println(set07);
		System.out.println(set08);
	}
}
