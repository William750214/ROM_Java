package com.heynas.Test;

import com.heynas.inner.Outer;

/**
 * Description:  TestInner
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestInner {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.testAccess();
	}
}
