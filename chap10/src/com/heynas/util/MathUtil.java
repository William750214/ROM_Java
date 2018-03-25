package com.heynas.util;

/**
 * Description:  MathUtil<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class MathUtil {
	public static final Long random(Long a, Long b) {
		return Math.round(Math.floor(Math.random() * (b - a + 1)) + a);
	}
}
