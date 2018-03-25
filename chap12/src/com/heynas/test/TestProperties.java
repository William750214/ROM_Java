package com.heynas.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Description:  TestProperties<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestProperties {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();

		properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("system.properties"));

		System.out.println(properties.getProperty("AAA"));
		System.out.println(properties.getProperty("BBB"));
		System.out.println(properties.getProperty("HHH","888"));

		properties.setProperty("GGG","666");

		System.out.println();
	}
}
