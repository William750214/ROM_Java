package com.heynas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description:  TestCollections<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestCollections {
	public static void main(String[] args) {
		List lst01 = new ArrayList();
		List lst02 = new ArrayList();
		lst01.add(10);
		lst01.add(20);
		lst01.add(30);
		lst01.add(40);
		lst01.add(50);
		lst01.add(60);
		lst01.add(70);
		lst01.add(80);
		lst01.add(90);
		lst01.add(40);
		lst01.add(50);
		lst01.add(60);
		lst01.add(70);
		lst01.add(80);


		lst02.add(40);
		lst02.add(50);
		lst02.add(60);
		lst02.add(70);


//		Collections.reverse(lst01);
//		Collections.shuffle(lst01);
//		Collections.sort(lst01);
//		Collections.swap(lst01,3,8);
//		Collections.rotate(lst01,-3);
//		Collections.fill(lst01,100);

		Collections.replaceAll(lst01,40,400);

		System.out.println(lst01);

		System.out.println(Collections.binarySearch(lst01,60));
		System.out.println(Collections.max(lst01));
		System.out.println(Collections.min(lst01));
		System.out.println(Collections.frequency(lst01,60));
		System.out.println(Collections.indexOfSubList(lst01,lst02));
		System.out.println(Collections.lastIndexOfSubList(lst01,lst02));

		List lst03 = Collections.emptyList();
		List lst04 = Collections.singletonList(10);
		List lst05 = Collections.unmodifiableList(lst01);
		System.out.println(lst03.size());
		System.out.println(lst04.size());
		System.out.println(lst05.size());
		lst05.add(10);

	}
}
