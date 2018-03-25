package com.heynas.bean;

/**
 * Description:  Student
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Student extends Person {
	String school;

	public Student() {
		super();
//		System.out.println("2:Student is constructed!");
	}

	public Student(String school) {
		super();
		this.school = school;
	}

	public Student(String name, String school) {
		super(name);
		this.school = school;
	}

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	public Student(String name, int age, boolean sex, String school) {
		super(name, age, sex);
		this.school = school;
	}

	public void shout() {
		System.out.println(getInfo() + "I am from " + school + ".");
	}
}
