package com.heynas.test;

import java.util.Stack;

/**
 * Description:  TestStack<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestStack {
	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(10);
		stack.push(20);
		stack.push(30);

//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}
}
