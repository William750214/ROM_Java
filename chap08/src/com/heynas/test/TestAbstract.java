package com.heynas.test;

import com.heynas.bean.abstractclass.*;
import com.heynas.bean.composition.Car;
import com.heynas.bean.composition.Container;
import com.heynas.bean.composition.Engine;
import com.heynas.bean.composition.Wheel;
import com.heynas.bean.intf.Moveable;

/**
 * Description:  TestAbstract
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestAbstract {
	public static void main(String[] args) {
		Animal ani01 = new Cat(false);
		Animal ani02 = new Dog();
		Animal ani03 = new Pig();

		ani01.shout();
		ani02.shout();
		ani03.shout();

		Bird bird01 = new Eagle();
		bird01.shout();
		bird01.fly();

		Animal ani04 = new Eagle();
		ani04.shout();

//		Animal ani = new Animal() {
//			@Override
//			public void shout() {
//
//			}
//		};
	}
}
