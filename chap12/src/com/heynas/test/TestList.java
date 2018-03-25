package com.heynas.test;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * Description:  TestList<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestList {
	public static void main(String[] args) {
		List lst01 = new ArrayList<Integer>();
		List lst02 = new ArrayList();

//		((ArrayList)lst01).ensureCapacity(100);

		lst01.add(10);
		lst01.add(20);
		lst01.add(30);
		lst01.add(1,40);
		lst01.add(30);
		lst01.add(50);
		lst01.add(60);

		lst02.addAll(lst01);



		System.out.println(lst01);
		System.out.println(lst02);

		System.out.println(lst01.get(0));

		System.out.println(lst01.indexOf(30));
		System.out.println(lst01.lastIndexOf(30));


		System.out.println(lst01);
//		lst01.remove(3);
		lst01.set(3,70);
		System.out.println(lst01);

		List lst03 = lst01.subList(3,5);

		System.out.println(lst03);

		System.out.println(lst01);
		lst01.replaceAll(new UnaryOperator() {
			@Override
			public Object apply(Object o) {
				int a = (int)o;
				return a + 10;
			}
		});
		System.out.println(lst01);

		lst01.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int a = (int)o1;
				int b = (int)o2;

				if (a > b) {
					return 1;
				} else if (a < b) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(lst01);

		System.out.println(lst01.size());
		System.out.println(lst01.isEmpty());

//		lst01.clear();

		System.out.println(lst01.size());
		System.out.println(lst01.isEmpty());

		System.out.println(lst01.contains(10));
		System.out.println(lst01.contains(20));

		Object[] objects = lst01.toArray();

		System.out.println(Arrays.toString(objects));

		List lst05 = Arrays.asList(10,20,30,40,50,60,70,80);

//		lst05.add(90);

		System.out.println(lst05);

		System.out.println(lst01.getClass().getName());
		System.out.println(lst05.getClass().getName());

	}
}
