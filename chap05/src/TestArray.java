/**
 * Description:  TestArray
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestArray {
	public static void main(String[] args) {
//		int[] score = new int[3];
//
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 30;

//		int[] score = {10,20,30};
//
//		for (int i = 0; i < score.length; i++) {
//			System.out.println(score[i]);
//		}

		int[] score = {30, 20, 50, 10, 40, 60, 90, 80, 70};
		int max = score[0];
		int min = score[0];

		for (int x : score) {
			if (x > max) {
				max = x;
			} else if (x < min) {
				min = x;
			}
		}

		System.out.println("Max Value is " + max);
		System.out.println("Min Value is " + min);

	}
}
