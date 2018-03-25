package com.heynas.test;

import com.heynas.bean.Person;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Description:  TestWrapper<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestWrapper {
	public static void main(String[] args) {
		Integer num1 = 3;
		Integer num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);

		Person p1 = new Person();
		Person p2 = new Person("zhangsan", 18, true);
		p1.shout();
		p2.shout();
	}
}
