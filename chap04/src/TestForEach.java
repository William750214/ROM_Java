/**
 * Description:  TestForEach
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestForEach {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60,70,80,90};

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int num: arr) {
			System.out.println(num);
		}
	}
}
