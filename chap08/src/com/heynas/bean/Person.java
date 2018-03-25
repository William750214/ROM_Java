package com.heynas.bean;

import com.heynas.bean.intf.Soundable;

/**
 * Description:  Person
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Person implements Soundable{
	private String name;
	private int age;
	private boolean sex;

	public Person() {
//		System.out.println("1:Person is constructed!");

	}

	public Person(String name) {
		this();
		this.name = name;
	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	public Person(String name, int age, boolean sex) {
		this(name, age);
		this.sex = sex;
	}

	public String getInfo() {
		return "I am " + name + "." + "I am " + age + "." + "I am " + (sex ? "a man" : "a women") + ".";
	}

	@Override
	public void shout() {
		System.out.println("I am " + name + "." + "I am " + age + "." + "I am " + (sex ? "a man" : "a women") + ".");
	}

	@Override
	public void hear() {

	}

//	public void shout() {
//		System.out.println("I am " + name + "." + "I am " + age + "." + "I am " + (sex ? "a man" : "a women") + ".");
//	}
}
