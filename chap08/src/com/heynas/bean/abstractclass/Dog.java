package com.heynas.bean.abstractclass;

/**
 * Description:  Dog
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Dog extends Animal {
	public void shout() {
		System.out.println("Dog shout!");
	}

	@Override
	public void hear() {

	}

	@Override
	public void run() {
		System.out.println("Dog run!");
	}

//	@Override
//	public void jump() {
//		System.out.println("Dog jump!");
//	}
}
