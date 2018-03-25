package com.heynas.test;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by William on 2017/5/28.
 */
public class TestConvertStream {

    public static void main(String[] args) {

        System.out.println(Charset.defaultCharset());

        try {
//            FileInputStream fis = new FileInputStream("d:\\temp\\abc_UTF8.txt");
            FileInputStream fis = new FileInputStream("d:\\temp\\abc.txt");
            FileOutputStream fos = new FileOutputStream("d:\\temp\\def.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(fis,"GBK"));
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos,"GBK"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String strLine = br.readLine();

            while (strLine != null) {
                bw.write(strLine);
                bw.newLine();
                strLine = br.readLine();
            }

            br.close();
            fis.close();
            bw.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
