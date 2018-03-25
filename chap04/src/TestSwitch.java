/**
 * Description:  TestSwitch
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestSwitch {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
//		int num  = 100;
		int level = num / 10;

		switch (level) {
			case 10:
			case 9:
				System.out.println(num + " is Grade A");
				break;
			case 8:
				System.out.println(num + " is Grade B");
				break;
			case 7:
				System.out.println(num + " is Grade C");
				break;
			case 6:
				System.out.println(num + " is Grade D");
				break;
			default:
				System.out.println(num + " is Grade E");
		}

		String weekday = "SUNDAY";

		switch (weekday) {
			case "MONDAY":
				System.out.println("Today is Monday!");
				break;
			case "TUESDAY":
				System.out.println("Today is Tuesday!");
				break;
			case "WENDESDAY":
				System.out.println("Today is Tuesday!");
				break;
			case "THURSDAY":
				System.out.println("Today is Thursday!");
				break;
			case "FRIDAY":
				System.out.println("Today is Friday!");
				break;
			default:
				System.out.println("Today is weekend!");

		}

	}
}
