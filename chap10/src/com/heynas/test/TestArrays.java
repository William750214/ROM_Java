package com.heynas.test;

import com.heynas.bean.Person;

import java.util.Arrays;

/**
 * Description:  TestArrays<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestArrays {
	public static void main(String[] args) {
		int[] arr01 = {10, 20, 30, 40, 50, 60, 70, 80};

		System.out.println(Arrays.toString(arr01));

		int[] arr02 = new int[10];
		Arrays.fill(arr02, 100);

		System.out.println(Arrays.toString(arr02));

		int[] arr03 = Arrays.copyOf(arr01, 5);

		System.out.println(Arrays.toString(arr03));

		int[] arr04 = Arrays.copyOfRange(arr01, 3, 5);

		System.out.println(Arrays.toString(arr04));

		System.out.println(Arrays.equals(arr01, arr02));

		int[] arr05 = Arrays.copyOf(arr01, 8);

		System.out.println(Arrays.equals(arr01, arr05));

		int[] arr06 = {20, 50, 30, 60, 10, 70, 40, 80};

		System.out.println(Arrays.toString(arr06));

		Arrays.sort(arr06);

		System.out.println(Arrays.toString(arr06));

		System.out.println(Arrays.binarySearch(arr01, 70));
		System.out.println(Arrays.binarySearch(arr01, -10));
		System.out.println(Arrays.binarySearch(arr01, 10));

		Person p01 = new Person("zhangsan", 18, true);
		Person p02 = new Person("lisi", 17, false);
		Person p03 = new Person("wangwu", 19, true);

		Person[] persons01 = new Person[]{p01, p02, p03};

//		System.out.println(Arrays.toString(persons01));
//
//		Person[] persons02 = new Person[3];
//		Person p04 = new Person("liuliu",20,true);
//		Arrays.fill(persons02,p04);
//
//		persons02[0].setName("zaoqi");
//
//		System.out.println(Arrays.toString(persons02));
//
		Person[] persons03 = Arrays.copyOf(persons01, 3);

//		System.out.println(Arrays.toString(persons03));
//
//		persons01[0].setName("zaoqi");

//		System.out.println(Arrays.toString(persons03));

		System.out.println(Arrays.equals(persons01, persons03));

		Person p11 = new Person("zhangsan", 18, true);
		Person p12 = new Person("lisi", 17, false);
		Person p13 = new Person("wangwu", 19, true);

		Person[] persons11 = new Person[]{p11, p12, p13};

		System.out.println(Arrays.equals(persons01, persons11));

		Arrays.sort(persons11);

		System.out.println(Arrays.toString(persons11));

		System.out.println(Arrays.binarySearch(persons11, p12));

		Person p22 = new Person("lisi", 17, false);

		System.out.println(Arrays.binarySearch(persons11, p22));

		Person p33 = new Person("liuliu", 28, true);

		System.out.println(Arrays.binarySearch(persons11, p33));

		System.out.println(p11.compareTo(p12));
		System.out.println(p12.compareTo(p13));

		int[][] arr08 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		System.out.println(Arrays.toString(arr08));
		System.out.println(Arrays.deepToString(arr08));

		int[][] arr09 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		System.out.println(Arrays.equals(arr08,arr09));
		System.out.println(Arrays.deepEquals(arr08,arr09));

	}
}
