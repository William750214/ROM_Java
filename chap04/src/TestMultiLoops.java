/**
 * Description:  TestMultiLoops
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestMultiLoops {
	public static void main(String[] args) {

		label1:
		for (int i = 1; i <=9 ; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * j > 36) {
					continue label1;
				}
				System.out.print(i + " x " + j + " = " + i * j + "    ");
			}
			System.out.println();
		}
	}
}
