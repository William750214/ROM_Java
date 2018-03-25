package com.heynas.bean.abstractclass;

/**
 * Description:  Eagle
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Eagle extends Bird{
	@Override
	public void shout() {
		System.out.println("Eagle shout!");
	}

	@Override
	public void hear() {

	}

	@Override
	public void fly() {
		System.out.println("Eagle fly!");
	}
}
