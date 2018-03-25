package com.heynas.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Description:  TestExceptionMessage<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestExceptionSuppressed {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fileInputStream = null;
		FileNotFoundException resultException = null;

		try {
			fileInputStream = new FileInputStream("d:\\abc.txt");
			System.out.println("File Operating");
		} catch (FileNotFoundException e) {
			resultException = e;
		} finally {
			try {
				fileInputStream.close();
			} catch (Exception e) {
				resultException.addSuppressed(e);
//				System.out.println(resultException.getSuppressed());
			}
		}

		if (resultException != null) {
			throw resultException;
		}
	}
}
