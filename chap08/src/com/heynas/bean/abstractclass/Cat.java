package com.heynas.bean.abstractclass;

/**
 * Description:  Cat
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Cat extends Animal {
	public Cat(boolean sex) {
		super(sex);
	}

	public void shout() {
		System.out.println("Cat shout!");
	}

	@Override
	public void hear() {

	}
}
