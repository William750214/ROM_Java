/**
 * Description:  TestScope
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class TestScope {
    int t4 = 8;

    public void test() {
        int t1 = 8;
        System.out.println(t4);
    }

    public static void main(String[] args) {
        int t2 = 8;
        {
            int t3 = 8;
            System.out.println(t2);
            {
                System.out.println(t3);
            }
        }

        {
//			System.out.println(t3);
        }

//		System.out.println(t1);
    }
}
