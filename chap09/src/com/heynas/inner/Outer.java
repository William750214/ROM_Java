package com.heynas.inner;

/**
 * Description:  Outer
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Outer {
	private static String a;

	private static void testSelf() {
		System.out.println(a);
	}

	public class Inner {
		public void testAccess() {
			testSelf();
			System.out.println(a);
		}
	}
}
