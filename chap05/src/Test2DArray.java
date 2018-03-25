/**
 * Description:  Test2DArray
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Test2DArray {
	public static void main(String[] args) {
//		int[][] score = new int[10][3];
//
//		score[0][0] = 60;
//		score[0][1] = 60;
//		score[0][2] = 60;
//
//		score[1][0] = 70;
//		score[1][1] = 70;
//		score[1][2] = 70;
//
//		score[2][0] = 80;
//		score[2][1] = 80;
//		score[2][2] = 80;

//		int [][]score = new int[10][];
//		score[0] = new int[3];
//		score[1] = new int[4];
//		score[2] = new int[5];
//
//		score[0][0] = 60;
//		score[0][1] = 60;
//		score[0][2] = 60;
//
//		score[1][0] = 70;
//		score[1][1] = 70;
//		score[1][2] = 70;
//
//		score[2][0] = 80;
//		score[2][1] = 80;
//		score[2][2] = 80;

		int[][] score = {{60,60,60},{70,70,70},{80,80,80},{90,90,90,90,90}};

		System.out.println("chinese" + "  " + "math" + "  " + "english");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "      ");
			}
			System.out.println();
		}

	}
}
