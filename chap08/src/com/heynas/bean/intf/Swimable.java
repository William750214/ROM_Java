package com.heynas.bean.intf;

/**
 * Description:  Swimable
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public interface Swimable extends Moveable{
	String SWIM_ZYY = "";
	String SWIM_WY = "";

	void swim();

	static void testSwim() {
		System.out.println("Test Swim");
	}
}