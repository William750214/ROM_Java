package com.heynas.test;

import com.heynas.bean.Person;

/**
 * Description:  TestClass<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestClass {
	public static void main(String[] args) {

		for (int i = 0; i < 1000000; i++) {
			Person person1 = new Person("zhangsan", 18, true);

			Class clazz = person1.getClass();

//			System.out.println(clazz.getName());
//			System.out.println(clazz.getSimpleName());

			person1 = null;
		}

		System.out.println();

	}
}
