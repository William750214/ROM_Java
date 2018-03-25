package com.heynas.bean.composition;

/**
 * Description:  Truck
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Truck extends Car {
	public Truck(Container container, Engine engine, Wheel wheel) {
		super(container, engine, wheel);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Truck do extra activities!");
	}
}
