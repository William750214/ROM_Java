package com.heynas.test;

import com.heynas.bean.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Description:  TestHashSet<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set set01 = new HashSet();

		set01.add(30);
		set01.add(50);
		set01.add(10);
		set01.add(80);
		set01.add(90);
		set01.add(30);
		set01.add(10);

		System.out.println(set01);
		System.out.println(set01.size());

		Set set02 = new HashSet();
		Person person01 = new Person("zhangsan", 18, true);
		Person person02 = new Person("lisi", 20, false);
		Person person03 = new Person("wangwu", 19, true);
		Person person04 = new Person("zhangsan", 18, true);

		set02.add(person01);
		set02.add(person02);
		set02.add(person03);
		set02.add(person04);

		System.out.println(set02);
		System.out.println(set02.size());


		Set set03 = new LinkedHashSet();

		set03.add(30);
		set03.add(50);
		set03.add(10);
		set03.add(80);
		set03.add(90);
		set03.add(30);
		set03.add(10);

		System.out.println(set03);
		System.out.println(set03.size());




	}
}
