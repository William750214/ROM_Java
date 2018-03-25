package com.heynas.test;

import java.io.*;

/**
 * <p> Description:  TestMemoryStream </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestMemoryStream {
    public static void main(String[] args) throws IOException {

        String strIn = "J2EE老炮课程";

        StringReader sr = new StringReader(strIn);
        StringWriter sw = new StringWriter();

        int b = sr.read();

        while (b != -1) {
            sw.write(b);
            b = sr.read();
        }

        System.out.println(sw.toString());

        sr.close();
        sw.close();


//        char[] charsIn = "J2EE老炮课程".toCharArray();
//
//        CharArrayReader car = new CharArrayReader(charsIn);
//        CharArrayWriter caw = new CharArrayWriter();
//
//        int b = car.read();
//
//        while (b != -1) {
//            caw.write(b);
//            b = car.read();
//        }
//
//        System.out.println(caw.toString());
//
//        car.close();
//        caw.close();


//        byte[] bytesIn = "J2EE老炮课程".getBytes();
//
//        ByteArrayInputStream bis = new ByteArrayInputStream(bytesIn);
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//
//        byte[] data = new byte[bis.available()];
//
////        int b = bis.read();
////
////        while (b != -1) {
////            bos.write(b);
////            b = bis.read();
////        }
//        bis.read(data);
//
//        bos.write(data);
//
//        System.out.println(bos.toString());
//
//        bis.close();
//        bos.close();

    }
}
