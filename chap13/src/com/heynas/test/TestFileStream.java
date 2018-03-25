package com.heynas.test;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by William on 2017/5/28.
 */
public class TestFileStream {

    public static void main(String[] args) {

        File inputFile = new File("d:\\temp\\abc.txt");
        File outputFile = new File("d:\\temp\\def.txt");

//        try {
//            FileInputStream fis = new FileInputStream("d:\\temp\\abc.pptx");
//            FileOutputStream fos = new FileOutputStream("d:\\temp\\def.pptx");
//
//            int b = fis.read();
//
//            while (b != -1) {
//                fos.write(b);
//                b = fis.read();
//            }
//
//            fis.close();
//            fos.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(Charset.defaultCharset());

        try {
            FileReader fr = new FileReader("d:\\temp\\abc_UTF8.txt");
            FileWriter fw = new FileWriter("d:\\temp\\def.txt");

            int c = fr.read();

            while (c != -1) {
//                fw.write(c);
                System.out.print((char)c);
                c = fr.read();
            }

            fw.write("Hello Java,Hello Java, Hello Java语言");

            fr.close();
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
