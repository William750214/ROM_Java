/**
 * Description:  TestExpression
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestExpression {
	public static void main(String[] args) {
		System.out.println("-------算术运算符-------");

		int a = 8;
		int b = 10;

		int c = a + b;


		System.out.println(c);
		System.out.println("Hello" + " World!");

		int e = 11;
		int f = -2;

		System.out.println(e / f);
		System.out.println(e % f);
		System.out.println(11 % 3);

		int g = 8;
//		System.out.println(++g);
//		System.out.println(g++);
//		System.out.println(--g);
		System.out.println(g--);
		System.out.println(g);

		System.out.println("-------关系运算符-------");
		int aa1 = 8;
		int aa2 = 10;
		int aa3 = 8;
		int aa4 = 18;

		System.out.println(aa1 == aa2);
		System.out.println(aa1 == aa3);
		System.out.println(aa1 > aa3);
		System.out.println(aa1 <= aa3);

//		System.out.println(aa1 = aa2);

		System.out.println(8 == aa1);

		System.out.println("-------逻辑运算符-------");
		boolean bb1 = true;
		boolean bb2 = false;
//		System.out.println(!bb1);

//		System.out.println(true & true);
//		System.out.println(true & false);
//		System.out.println(false & true);
//		System.out.println(false & false);

//		System.out.println(true | true);
//		System.out.println(true | false);
//		System.out.println(false | true);
//		System.out.println(false | false);

//		int cc1 = 8;
//		System.out.println((9 > 8) || (cc1++ > 6));
//
//		System.out.println(cc1);

//		System.out.println(true ^ true);
//		System.out.println(true ^ false);
//		System.out.println(false ^ true);
//		System.out.println(false ^ false);


		System.out.println("-------位运算符-------");
//		int dd1 = 1;
//		int dd2 = 3;
//		System.out.println(dd1 & dd2);
//		System.out.println(dd1 | dd2);
//		System.out.println(dd1 ^ dd2);
//		System.out.println(~dd2);
//		System.out.println(dd2 << 1);

		int dd3 = 0b1010_1111;
		System.out.println(dd3 >>> 2);

		System.out.println("-------赋值运算符-------");
		int ee1 = (int) 3.14;

//		ee1 = ee1 + 1;
		ee1 += 1;
		System.out.println(ee1);

		System.out.println("-------其它运算符-------");

		int score = 50;
//		System.out.println((score >= 60) ? "及格" : "不及格");
		System.out.println((score >= 60) ? 1 : 0);

		System.out.println("Hello" instanceof String);

		int m = 2;
		int n = m + (3 * (m++));
		System.out.println(n);


	}
}
