/**
 * Description:  TestDataType
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestDataType {
	public static void main(String[] args) {
		int num = 25;
		int num8 = 031;
		int num16 = 0x19;
		int num2 = 0b11001;

		System.out.println(num);
		System.out.println(num8);
		System.out.println(num16);
		System.out.println(num2);
		System.out.println(num + num8 + num16 + num2);

		int n1 = 123_456_789;
		System.out.println(n1);

		long l1 = 12345678999999999L;

		byte b1 = 127;
		short s1 = -32768;

		System.out.println(b1);

		float f1 = 3.14F;
		double d1 = 3.14e-5;
		System.out.println(d1);

		char c1 = '0';
		char c2 = 'a';
		char c3 = '$';
		char c4 = '中';
		char c5 = 'の';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		boolean bl1 = true;
		boolean bl2 = false;

		System.out.println(bl1);
		System.out.println(bl2);

		char c6 = '\u0061';
		char c7 = '\u4e2d';
		char c8 = '\u306e';
		char c9 = '\141';

		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);

		String str = "a\nbc";

		System.out.println(str);


		String rn = System.getProperty("line.separator");
		String str1 = "a" + rn + "bc";
		System.out.println("-------------------");
		System.out.println(str1);

		char c10 = '\'';
		System.out.println(c10);

		String str2 = "\"";
		System.out.println(str2);

		String str3 = "\\";
		System.out.println(str3);

		String str4 = "\\\\";
		System.out.println(str4);



	}
}
