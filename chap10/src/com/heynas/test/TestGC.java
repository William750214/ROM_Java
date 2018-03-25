package com.heynas.test;

import java.io.IOException;

/**
 * Description:  TestGC<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestGC {
	public static void main(String[] args) throws IOException, InterruptedException {

//		System.exit(100);

//		System.gc();
//		System.runFinalization();


//		for (int i = 0; i < 1000; i++) {
//			Person person = new Person("zhangsan",18,true);
//			person = null;
//		}


		System.out.println("Hello GC!");
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getenv("AAA"));
		System.out.println(System.getenv("BBB"));
		System.out.println(args[0]);
		System.out.println(args[1]);

		Thread.sleep(3000);

		System.exit(100);

	}
}
