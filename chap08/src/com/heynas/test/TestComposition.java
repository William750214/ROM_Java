package com.heynas.test;

import com.heynas.bean.composition.Car;
import com.heynas.bean.composition.Container;
import com.heynas.bean.composition.Engine;
import com.heynas.bean.composition.Wheel;

/**
 * Description:  TestComposition
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestComposition {
	public static void main(String[] args) {
		Car car = new Car(new Container(), new Engine(), new Wheel());

		car.run();
	}
}
