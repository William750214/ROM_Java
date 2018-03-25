package com.heynas.test;

import java.net.URL;

/**
 * <p> Description:  TestBootstrapClassLoader </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestBootstrapClassLoader {
    public static void main(String[] args) {
        URL[]urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();

        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }



    }
}
