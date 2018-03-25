package com.heynas.test;

import com.heynas.bean.Person;

import java.util.*;

/**
 * Description:  TestTreeSet<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestTreeSet {
	public static void main(String[] args) {
//		Set set01 = new TreeSet(new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				Person person01 = (Person)o1;
//				Person person02 = (Person)o2;
//
//				if (person01.getAge() > person02.getAge()) {
//					return 1;
//				} else if (person01.getAge() < person02.getAge()) {
//					return -1;
//				} else {
//					return 0;
//				}
//			}
//		});
		NavigableSet set01 = new TreeSet();
		set01.add(30);
		set01.add(50);
		set01.add(10);
		set01.add(80);
		set01.add(90);
		set01.add(30);
		set01.add(10);
//		Person person01 = new Person("zhangsan", 18, true);
//		Person person02 = new Person("lisi", 20, false);
//		Person person03 = new Person("wangwu", 19, true);
//		Person person04 = new Person("niuliu", 18, true);
//
//		set01.add(person01);
//		set01.add(person02);
//		set01.add(person03);
//		set01.add(person04);

		System.out.println(set01);
//		System.out.println(set01.pollFirst());
//		System.out.println(set01.pollLast());
		System.out.println(set01);
		System.out.println(set01.higher(55));
		System.out.println(set01.lower(35));
		System.out.println(set01.subSet(25,85));
		System.out.println(set01.tailSet(40));
		System.out.println(set01.headSet(40));
		System.out.println(set01.floor(40));
		System.out.println(set01.ceiling(40));


	}
}
