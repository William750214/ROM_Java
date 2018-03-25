package com.heynas.bean;

import java.util.Objects;

/**
 * Description:  Person
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Person implements Comparable{
	private String name;
	private int age;
	private boolean sex;

	public Person() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sex=" + sex +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age &&
				sex == person.sex &&
				Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, sex);
	}

	@Override
	public int compareTo(Object o) {
		Person person = (Person)o;
		if (this.age > ((Person) o).getAge()) {
			return 1;
		} else if (this.age < ((Person) o).getAge()) {
			return -1;
		} else {
			return 0;
		}
	}
}
