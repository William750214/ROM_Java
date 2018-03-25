/**
 * Description:  TestCompare
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestCompare {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan", 18, true);
		Person p2 = new Person("zhangsan", 18, true);

		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));

		System.out.println("-----------------------------------");

		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println("-----------------------------------");

		String str3 = "Hello";
		String str4 = "Hello";

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3 == str1);
		System.out.println(str3.equals(str1));
	}
}
