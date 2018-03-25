package com.heynas.test;

import com.heynas.bean.*;

/**
 * Description:  Test01
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Test01 {
	public static void main(String[] args) {
//		Student stu01 = new Student("zhangsan",18,true,"A School");
		Person per01 = new Student("zhangsan",18,true,"A School");
		Person per02 = new Teacher("lisi",38,false,"English Teacher");

		per01.shout();
		per02.shout();

//		System.out.println(stu01 instanceof Student);
//		System.out.println(stu01 instanceof Person);

//		Person person = new Person("zhangsan",18,true);
//		Student stu01 = (Student) new Person("zhangsan",18,true);
//		stu01.shout();

		new Person().shout();

	}
}
