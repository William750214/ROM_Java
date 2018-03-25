/**
 * Description:  Person
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Person {
	String name;
	int age;
	boolean sex;
	static String country;
	static String city = "上海";
//	static String name;

	static {
		country = "中国";
		System.out.println("Person class init!");
	}

	public Person() {
//		System.out.println("1:Person is constructed!");
	}

	public Person(String name) {
		this();
		this.name = name;
	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	public Person(String name, int age, boolean sex) {
		this(name, age);
		this.sex = sex;
	}

	void shout() {
//		String name = "Anyone";
		{
			String name = "Anyone";
		}
		System.out.println("I am " + name + "." + "I am " + age + "." + "I am " + (sex ? "a man" : "a women") + ".");
//		shoutWhere();
	}

	void shout(String info1) {
		System.out.println("I am " + name + "." + "I am " + age + "." + "I am " + (sex ? "a man" : "a women") + ".");
		System.out.println(info1);
	}

	void shout(String info1, String info2) {
		System.out.println("I am " + name + "." + "I am " + age + "." + "I am " + (sex ? "a man" : "a women") + ".");
		System.out.println(info1);
		System.out.println(info2);
	}

	static void shoutWhere() {
		String country = "Anywhere";
		System.out.println("I am from " + Person.country);
	}
}
