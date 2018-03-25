package com.heynas.test;

/**
 * Description:  TestNumber<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestNumber {
	public static void main(String[] args) {
		int i01 = 10;
		long l01 = 20000000000000l;

		l01 = i01;

		i01 = (int) l01;

		System.out.println(i01);

		Double d01 = 123234242342.456;

		System.out.println(d01.byteValue());
		System.out.println(d01.intValue());
		System.out.println(d01.longValue());
		System.out.println(d01.floatValue());
		System.out.println(d01.doubleValue());

		byte b01 = 97;
		char c01 = 'a';
		char c02 = 97;
		char c03 = '中';
		char c04 = 20013;

		System.out.println(c02);
		System.out.println(c03 + 0);
		System.out.println(c04);

		System.out.println("-----------------------------");

		System.out.println(Byte.BYTES + ":" + Byte.SIZE + ":" + Byte.TYPE + ":" + Byte.MAX_VALUE + ":" + Byte.MIN_VALUE);
		System.out.println(Character.BYTES + ":" + Character.SIZE + ":" + Character.TYPE + ":" + Character.MAX_VALUE + ":" + Character.MIN_VALUE);
		System.out.println(Short.BYTES + ":" + Short.SIZE + ":" + Short.TYPE + ":" + Short.MAX_VALUE + ":" + Short.MIN_VALUE);
		System.out.println(Integer.BYTES + ":" + Integer.SIZE + ":" + Integer.TYPE + ":" + Integer.MAX_VALUE + ":" + Integer.MIN_VALUE);
		System.out.println(Long.BYTES + ":" + Long.SIZE + ":" + Long.TYPE + ":" + Long.MAX_VALUE + ":" + Long.MIN_VALUE);
		System.out.println(Float.BYTES + ":" + Float.SIZE + ":" + Float.TYPE + ":" + Float.MAX_VALUE + ":" + Float.MIN_VALUE);
		System.out.println(Double.BYTES + ":" + Double.SIZE + ":" + Double.TYPE + ":" + Double.MAX_VALUE + ":" + Double.MIN_VALUE);


		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);

		System.out.println(1.0/0.0);

//		System.out.println(1/0);

		double d03 = Double.parseDouble("123.456");
		long l03 = Long.parseLong("123434");

		long l04 = Long.parseLong("1011101101111",2);
		long l05 = Long.parseLong("abcde",16);

		System.out.println(l05);

		Long l06 = 123456l;
		System.out.println("-----------------------------");
		System.out.println(Long.toString(l06));
		System.out.println(Long.toBinaryString(l06));
		System.out.println(Long.toOctalString(l06));
		System.out.println(Long.toHexString(l06));
	}
}
