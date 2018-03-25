import java.util.HashMap;
import java.util.Map;

/**
 * Description:  TestFunction
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestFunction {
//	final static int NUM = 20;

//	static int add(int a, int b, int... c) {
//		int sum = a + b;
//
//		for (int i = 0; i < c.length; i++) {
////			sum = sum + c[i];
//			sum += c[i];
//		}
//
//		a = a + 100;
//
//		return sum;
//	}

	static void testPara(Map map) {
		map.put("A",20);
	}

	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		System.out.println(add(a, b, 32, 24, 45, 98));
//		System.out.println(a);
		Map map = new HashMap();
		map.put("A",10);
		System.out.println("Before:" + map);
		testPara(map);
		System.out.println("After:" + map);

	}
}
