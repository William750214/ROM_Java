package com.heynas.bean;

/**
 * Description:  Teacher
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Teacher extends Person {
	private String work;

	public Teacher(String name, int age, boolean sex, String work) {
		super(name, age, sex);
		this.work = work;
	}

	public void shout() {
		System.out.println(getInfo() + "I am " + work + ".");
	}
}
