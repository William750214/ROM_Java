/**
 * Description:  TestDataTypeConvert
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestDataTypeConvert {
	public static void main(String[] args) {
		int num1 = 8;
		float num2 = 3.34F;
		double num3 = 3.34D;

		int num4 = (int)(num1 + num2 + num3);

		System.out.println(num4);

		byte b1 = 18;
		byte b2 = 28;
		byte b3;

		b3 = (byte)(b1 + b2);

		char c1 = 'a';
		int num5 = c1 + 1;

		System.out.println(num5);


		char c2 = 97;
		System.out.println(c2);



	}
}
