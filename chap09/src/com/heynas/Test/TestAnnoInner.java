package com.heynas.Test;

import com.heynas.bean.Animal;
import com.heynas.bean.Tiger;

/**
 * Description:  TestAnnoInner<br>
 *     asfjkldsafjkl
 *     asfjlasjdfl
 *     asjfldasfj
 *     ajlsdfjdlasfj
 *     asldfdjasf
 *
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestAnnoInner {

	public static void main(String[] args) {
		Animal ani01 = new Tiger();
		ani01.shout();

		Animal ani02 = new Animal() {
			@Override
			public void shout() {
				System.out.println("Lion shout!");
			}
		};
		ani02.shout();

//
//		class Lion extends Animal {
//
//			@Override
//			public void shout() {
//
//			}
//		}
//		Animal ani03 = new Lion();
//		ani03.shout();
	}
}
