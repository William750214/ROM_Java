package com.heynas.bean.abstractclass;

import com.heynas.bean.intf.Moveable;

/**
 * Description:  Lion
 * Copyright: © 2016 Heynas Studio. All rights reserved.
 * Company: Heynas
 *
 * @author William
 * @version 1.0
 */
public class Lion implements Moveable{
	@Override
	public void run() {
		System.out.println("Lion Run!");
	}
}
