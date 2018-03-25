package com.heynas.inner;

/**
 * Description:  Ca
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Ca {
	private String a;

	/**
	 * Test is xxx method. sldafjslflasdjfldsjalf
	 * @param num1 num1 is xxx,xxx
	 * @param num2 num2 is xxx,xxx
	 */
	public void test(final int num1,final int num2) {
		final int temp = 10;
//		temp = 20;
		class MethodInner {
			public void testAccess() {
//				num1 = 8;
				System.out.println(a);
				System.out.println(temp);
				System.out.println(num1);
			}
		}
	}

	/**
	 * This is a private test method.
	 */
	private void test01() {
		System.out.println();
	}
}











