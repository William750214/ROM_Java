/**
 * Description:  TestBreakAndContinue
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestBreakAndContinue {
	public static void main(String[] args) {
		int [] arr = {20,30,80,40,50,10,60,70,90};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 50) {
//				break;
				continue;
			}
			System.out.println(arr[i]);
		}

		System.out.println("Continue...");


	}
}
