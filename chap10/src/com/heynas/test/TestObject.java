package com.heynas.test;

import com.heynas.bean.Person;

import java.time.LocalDateTime;

/**
 * Description:  TestObject<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestObject {
	public static void main(String[] args) {
		Object obj = new Object();

		System.out.println(obj.toString());


		Person person01 = new Person("zhangsan",18,true);
		Person person02 = new Person("zhangsan",18,true);
		Person person03 = person01;

		System.out.println(person01);
		System.out.println(person02);

//		LocalDateTime localDateTime = LocalDateTime.now();
//		System.out.println(localDateTime.toString());

		"A".equals("A");


//		System.out.println(person01 == person02);
//		System.out.println(person01.equals(person02));

		System.out.println(person03.equals("person01"));
		System.out.println(person01.equals(person02));
	}
}
