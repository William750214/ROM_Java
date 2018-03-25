package com.heynas.util;

/**
 * Description:  StringUtil<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class StringUtil {
	public static final boolean isEmpty(String str) {
		if (str == null) {
			return true;
		} else if (str.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
