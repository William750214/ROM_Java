package com.heynas.test;

import java.util.*;

/**
 * Description:  TestIterator<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestIterator {
	public static void main(String[] args) {
		List lst01 = new ArrayList();
		lst01.add(10);
		lst01.add(20);
		lst01.add(30);

		Set set01 = new LinkedHashSet();
		set01.add(40);
		set01.add(50);
		set01.add(60);

//		for (int i = 0; i < lst01.size(); i++) {
//			System.out.println(lst01.get(i));
//			lst01.set(i,80);
////			lst01.remove(i);
//		}
//
//		for (Object obj : lst01) {
//			System.out.println(obj);
//			lst01.remove(obj);
//
//		}

//		System.out.println(lst01);

//		for (Object obj : set01) {
//			System.out.println(obj);
////			set01.remove(obj);
//			set01.add(90);
//		}

//		Iterator it01 = lst01.iterator();
//		Iterator it02 = set01.iterator();
//
//		while (it01.hasNext()) {
//			System.out.println(it01.next());
//			it01.remove();
//		}
//
//		while (it02.hasNext()) {
//			System.out.println(it02.next());
//			it02.remove();
//		}

//		for (Iterator it01 = set01.iterator(); it01.hasNext(); ) {
//			Object obj = it01.next();
//			System.out.println(obj);
//			it01.remove();
////			set01.remove(obj);
//		}



//		System.out.println(lst01);
//		System.out.println(set01);

//		for (ListIterator iterator = lst01.listIterator(); iterator.hasNext(); ) {
//			Object next = iterator.next();
////			iterator.set((int)next + 10);
////			iterator.add(80);
////			iterator.remove();
////			System.out.println(iterator.nextIndex());
//			System.out.println(lst01.get(iterator.nextIndex() - 1));
//		}

//		System.out.println(lst01);

//		ListIterator listIterator = lst01.listIterator();
//
//		while (listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//
//		while (listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}

//		Deque deque01 = new ArrayDeque();
//		deque01.add(70);
//		deque01.add(80);
//		deque01.add(90);
//
//		for (Iterator iterator = deque01.descendingIterator(); iterator.hasNext(); ) {
//			Object next = iterator.next();
//			System.out.println(next);
//		}

		Vector vector = new Vector();
		vector.add(10);
		vector.add(20);
		vector.add(30);

//		for (Iterator iterator = vector.iterator(); iterator.hasNext(); ) {
//			Object next = iterator.next();
//			System.out.println(next);
//		}

		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}




	}
}
