package com.heynas.bean.abstractclass;

import com.heynas.bean.intf.Moveable;
import com.heynas.bean.intf.Soundable;
import com.heynas.bean.intf.Swimable;

/**
 * Description:  Animal
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public abstract class Animal implements Soundable,Swimable {
	private boolean sex;

	public Animal() {
	}

	public Animal(boolean sex) {
		this.sex = sex;
	}

//	public abstract void shout();

	public void eat() {
		System.out.println("Animal eat!");
	}


	@Override
	public void run() {

	}


	@Override
	public void swim() {

	}

	@Override
	public void fly() {

	}
}
