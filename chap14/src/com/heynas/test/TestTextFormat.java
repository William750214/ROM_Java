package com.heynas.test;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <p> Description:  TestTextFormat </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestTextFormat {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault());

        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources");

        String message = resourceBundle.getString("message01");

        message = MessageFormat.format(message,"abc","efg");

        System.out.println(message);
    }
}
