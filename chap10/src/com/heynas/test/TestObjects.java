package com.heynas.test;

import com.heynas.bean.Person;

import java.util.Objects;

/**
 * Description:  TestObjects<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestObjects {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = null;

//		System.out.println(Objects.toString(person1));
//		System.out.println(Objects.toString(person1,"This is an empty object!"));

//		System.out.println("Continued!");


		Person person2 = new Person("zhangsan", 18, true);
		Person person3 = (Person) person2.clone();
		Person person4 = null;

		System.out.println(person2.equals(person3));
		System.out.println(person2.equals(person4));
//		System.out.println(person4.equals(person2));

		System.out.println(Objects.equals(person2,person4));
		System.out.println(Objects.equals(null,null));

		System.out.println(Objects.isNull(person4));
		System.out.println(Objects.nonNull(person4));
		System.out.println(Objects.isNull(person2));
		System.out.println(Objects.nonNull(person2));

	}
}
