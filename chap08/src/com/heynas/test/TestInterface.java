package com.heynas.test;

import com.heynas.bean.abstractclass.Dog;
import com.heynas.bean.composition.Car;
import com.heynas.bean.composition.Container;
import com.heynas.bean.composition.Engine;
import com.heynas.bean.composition.Wheel;
import com.heynas.bean.intf.Brandable;
import com.heynas.bean.intf.Moveable;
import com.heynas.bean.intf.Swimable;

/**
 * Description:  TestInterface
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestInterface {
	public static void main(String[] args) {
		Moveable mov01 = new Dog();
		Moveable mov02 = new Car(new Container(), new Engine(), new Wheel());

		mov01.run();
		mov01.jump();

		mov02.run();

		System.out.println(Brandable.AUDI_BRAND);
		System.out.println(Swimable.SWIM_WY);

		Swimable.testSwim();
	}
}
