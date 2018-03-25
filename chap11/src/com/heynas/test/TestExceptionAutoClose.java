package com.heynas.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:  TestExceptionAutoClose<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestExceptionAutoClose {
	public static void main(String[] args) {

		try (FileInputStream fileInputStream = new FileInputStream("d:\\abc.txt");
		     FileOutputStream fileOutputStream = new FileOutputStream("d:\\efg.txt")) {

			System.out.println("File handle");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			try {
//				fileInputStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}
}
