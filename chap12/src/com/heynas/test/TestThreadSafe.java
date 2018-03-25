package com.heynas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Description:  TestThreadSafe<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestThreadSafe {
	public static void main(String[] args) {
		List lst02 = new ArrayList();
//		List lst01 = new Vector();
		List lst01 = Collections.synchronizedList(lst02);

		Thread thread01 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 3000; i++) {
					lst01.add(i);
				}
			}
		});
		Thread thread02 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 3000; i++) {
					lst01.add(i);
				}
			}
		});

		thread01.start();
		thread02.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(lst01.size());
	}
}
