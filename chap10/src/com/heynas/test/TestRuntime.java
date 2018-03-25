package com.heynas.test;

import java.io.File;
import java.io.IOException;

/**
 * Description:  TestRuntime<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestRuntime {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();

//		System.out.println(runtime.availableProcessors());

//		for (int i = 0; i < 1999999; i++) {
//			Person p = new Person("zhangsan",18,true);
//		}

//		System.out.println(runtime.totalMemory() / 1024 / 1024 + "M");
//		System.out.println(runtime.maxMemory() / 1024 / 1024 + "M");
//		System.out.println(runtime.freeMemory() / 1024 / 1024 + "M");

//		Process process01 = runtime.exec("cmd /c start dir");
//		Process process02 = runtime.exec("cmd /c start notepad.exe");
//		Process process03 = runtime.exec("cmd /c start D:\\temp\\abc.docx");
//		Process process04 = runtime.exec("cmd /c start xcopy D:\\temp\\1\\abc.docx D:\\temp\\2");
//		Process process05 = runtime.exec("cmd /c start xcopy .\\1\\abc.docx .\\2", null, new File("D:\\temp"));
//		String[] envp = {"AAA=111","BBB=222","PATH=C:\\Java\\jdk1.8.0_91\\bin"};
//		Process process06 = runtime.exec("cmd /c start java com.heynas.test.TestGC para1 para2",
//				envp, new File("D:\\RoadOfMaster\\01.Beginner\\01.Java语言(JDK1.8)一讲通\\02.Projects\\out\\production\\chap10"));
//		Process process07 = runtime.exec(new String[]{"cmd", "/c", "java com.heynas.test.TestGC","para1", "para2"},
//				null, new File("D:\\RoadOfMaster\\01.Beginner\\01.Java语言(JDK1.8)一讲通\\02.Projects\\out\\production\\chap10"));
//
//		int status = process07.waitFor();
//
//		switch (status) {
//			case 100:
//				System.out.println("A error!");
//				break;
//			case 200:
//				System.out.println("B error!");
//				break;
//			default:
//				System.out.println("Normal exit!");
//		}

//		System.out.println(status);

//		System.out.println("TestRuntime");

//		System.out.println(process07.exitValue());

		Thread thread01 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread01...");
			}
		});
		Thread thread02 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread02...");
			}
		});

		runtime.addShutdownHook(thread01);
		runtime.addShutdownHook(thread02);

		System.out.println("Main Thread...");

	}
}
