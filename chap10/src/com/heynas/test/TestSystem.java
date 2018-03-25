package com.heynas.test;

import com.heynas.bean.Person;

import java.util.*;

/**
 * Description:  TestSystem<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestSystem {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());

		long start = System.nanoTime();

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello System!");
		}

		long end = System.nanoTime();

		System.out.println("Costs = " + (end - start) + " ns.");

		Integer[] grades1 = new Integer[]{70, 80, 90, 100, 80, 90, 70, 60};
		Integer[] grades2 = new Integer[20];

		System.out.println(Arrays.toString(grades2));

		System.arraycopy(grades1, 0, grades2, 10, grades1.length);

		System.out.println(Arrays.toString(grades2));

		Person p1 = new Person("zhangsan", 18, true);
		Person p2 = new Person("lisi", 28, false);
		Person[] persons1 = new Person[]{p1, p2};
		Person[] persons2 = new Person[2];
		Person[] persons3 = persons1.clone();

		System.arraycopy(persons1, 0, persons2, 0, 2);
		p1.setName("wangwu");

		System.out.println(Arrays.toString(persons2));
		System.out.println(Arrays.toString(persons3));

		System.out.println("Line 01" + System.lineSeparator() + "Line 02");

		Map mapEnv = System.getenv();

		for (Iterator iterator = mapEnv.keySet().iterator(); iterator.hasNext(); ) {
			Object key = iterator.next();
//			System.out.println(key + "=" + mapEnv.get(key));
		}

		System.out.println(System.getenv("JAVA_HOME"));

		Properties properties = System.getProperties();

		for (Iterator<Object> iterator = properties.keySet().iterator(); iterator.hasNext(); ) {
			Object key = iterator.next();
//			System.out.println(key + "=" + properties.get(key));
		}

		System.out.println(System.getProperty("java.home"));

//		System.setProperty("name","zhangsan");

		System.out.println(System.getProperty("name"));
		System.out.println(System.getProperty("sex"));

		System.out.println(System.getenv("AAA"));

//		System.out.println(args[0] + args[1] + args[2]);


		Person person01 = new Person("Zhangsan",18,true);
		Person person02 = new Person("Zhangsan",18,true);

		System.out.println(person01.hashCode());
		System.out.println(person02.hashCode());
		System.out.println(Objects.hash(person01.getName(),person01.getAge(),person01.getSex(),person01.getGrades()));
		System.out.println(System.identityHashCode(person01));
		System.out.println(System.identityHashCode(person02));



	}
}
