/**
 * Description:  TestLifeCycle
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestLifeCycle {
	public static void doSomething1() {
		Person p = new Person("zhangsan", 18, true);
		p.shout();
	}

	public static void doSomething2(Person p) {
		p.shout();
	}

	public static void main(String[] args) {
//		Person p1 = new Person("zhangsan", 18, true);
//		Person p2 = p1;
//
//		p2.shout();
//
//		p1 = null;
//		p2 = null;

		doSomething1();
		doSomething2(new Person("zhangsan", 18, true));

	}
}
