package com.heynas.test;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by William on 2017/6/10.
 */
public class TestBufferedStream {
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
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("d:\\temp\\def.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String strLine = br.readLine();

            while (strLine != null) {
//                fw.write(strLine + System.getProperty("line.separator"));
                bw.write(strLine);
                bw.newLine();
//                System.out.println(strLine);
                strLine = br.readLine();
            }

//            fw.write("Hello Java,Hello Java, Hello Java语言");

            br.close();
            bw.close();
//            bw.flush();

            System.out.println("FR: " + fr.markSupported());
            System.out.println("BR: " + br.markSupported());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
