package com.heynas.bean;

import java.util.Arrays;
import java.util.Objects;

/**
 * Description:  Person<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class Person implements Cloneable,Comparable {
	private String name;
	private Integer age;
	private Boolean sex;
	private Integer[] grades;

	public Person() {
	}

	public Person(String name, Integer age, Boolean sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void shout() {
		System.out.println("I am " + name);
		System.out.println("I am " + age);
		System.out.println("I am " + sex);
	}

	@Override
	public String toString() {
		return "{" + "I am " + name + ";" + "I am " + age + ";" + "I am " + sex + "," + Arrays.toString(this.grades) + "}";
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name) &&
				Objects.equals(age, person.age) &&
				Objects.equals(sex, person.sex) &&
				Arrays.equals(grades, person.grades);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, sex, grades);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
//		System.out.println("Release Resources!");
//		System.out.println("Finalized!");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		if (person.getGrades() != null) {
			person.setGrades(person.getGrades().clone());
		}
		return person;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Integer[] getGrades() {
		return grades;
	}

	public void setGrades(Integer[] grades) {
		this.grades = grades;
	}


	@Override
	//0 -1 1
	public int compareTo(Object o) {
		if (this == o) return 0;
		if (o == null || getClass() != o.getClass()) return -1;
		Person person = (Person) o;
		if (this.age > person.age) {
			return 1;
		} else if (this.age < person.age) {
			return  -1;
		} else {
			return 0;
		}
	}
}
