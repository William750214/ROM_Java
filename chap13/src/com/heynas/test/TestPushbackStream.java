package com.heynas.test;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * <p> Description:  TestPushbackStream </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestPushbackStream {
    public static void main(String[] args) throws IOException {
        String strIn = "J2EE老炮课程";

        StringReader sr = new StringReader(strIn);

        PushbackReader pr = new PushbackReader(sr);

        System.out.println((char)(pr.read()));
        System.out.println((char)(pr.read()));
        pr.unread('3');
        System.out.println((char)(pr.read()));

//        while (b != -1) {
//            System.out.println((char)b);
//            b = pr.read();
//        }

        pr.close();
        sr.close();
    }
}
