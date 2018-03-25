package com.heynas.bean.intf;

/**
 * Description:  Moveable
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public interface Moveable {
	default void run(){};

	default void jump() {
		System.out.println("Default Jump!");
	};

	default void fly(){};
}