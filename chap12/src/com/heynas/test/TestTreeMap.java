package com.heynas.test;

import com.heynas.bean.Person;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Description:  TestTreeMap<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestTreeMap {
	public static void main(String[] args) {
		NavigableMap map01 = new TreeMap();

		map01.put("10","AAA");
		map01.put("30","CCC");
		map01.put("20","BBB");
		map01.put("50","DDD");
		map01.put("40","CCC");

		Map map02 = new TreeMap();
		Person person01 = new Person("zhangsan",18,true);
		Person person02 = new Person("lisi",20,false);
		Person person03 = new Person("wangwu",19,true);
		map02.put(person01,"AAA");
		map02.put(person02,"BBB");
		map02.put(person03,"CCC");

		System.out.println(map01);
		System.out.println(map02);

		System.out.println(map01.firstKey());
		System.out.println(map01.lastKey());
		System.out.println(map01.firstEntry());
		System.out.println(map01.lastEntry());


	}
}
