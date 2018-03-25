package com.heynas.test;

import java.util.*;

/**
 * Description:  TestDeque<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestDeque {
	public static void main(String[] args) {
//		Deque deque = new ArrayDeque();
		Deque deque = new LinkedList();
		deque.offerLast(10);
		deque.offerLast(20);
		deque.offerLast(30);
		deque.offerLast(40);
		deque.offerLast(50);
		deque.offerLast(60);
		deque.offerLast(70);
		deque.offerLast(80);

		System.out.println(deque);

		deque.pollFirst();
		deque.pollFirst();
		deque.pollFirst();

		System.out.println(deque);

		Deque stack = new ArrayDeque();
		stack.offerLast(10);
		stack.offerLast(20);
		stack.offerLast(30);
		stack.offerLast(40);
		stack.offerLast(50);
		stack.offerLast(60);
		stack.offerLast(70);
		stack.offerLast(80);

		System.out.println(stack);

		stack.pollLast();
		stack.pollLast();
		stack.pollLast();

		System.out.println(stack);

		Queue priorityQueue = new PriorityQueue();
		priorityQueue.offer(30);
		priorityQueue.offer(70);
		priorityQueue.offer(80);
		priorityQueue.offer(20);
		priorityQueue.offer(40);
		priorityQueue.offer(50);


		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());



	}
}
