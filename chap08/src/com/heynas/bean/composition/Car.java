package com.heynas.bean.composition;

import com.heynas.bean.intf.Moveable;

/**
 * Description:  Car
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Car implements Moveable{
	public static final String BENZ_BRAND = "benz";
	public static final String AUDI_BRAND = "audi";

	private Container container;
	private Engine engine;
	private Wheel wheel;

	public Car(Container container, Engine engine, Wheel wheel) {
		this.container = container;
		this.engine = engine;
		this.wheel = wheel;
	}

	public void run() {
		final String brand = "Benz";

		container.open();
		engine.start();
		wheel.roll();
//		System.out.println("Car is running!");
	}

	@Override
	public void jump() {

	}

	@Override
	public void fly() {

	}
}
