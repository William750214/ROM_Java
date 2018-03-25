package com.heynas.test;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by William on 2017/6/10.
 */
public class TestPrintStream {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset());

        try {
            FileReader fr = new FileReader("d:\\temp\\abc_UTF8.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("d:\\temp\\def.txt");
            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw, true);
//            PrintWriter pw = new PrintWriter(System.out, true);
            PrintStream ps = new PrintStream(new FileOutputStream("d:\\temp\\def_GBK.txt"), true, "GBK");

            String strLine = br.readLine();

            while (strLine != null) {
                ps.println(strLine);
                strLine = br.readLine();
            }

            br.close();
            ps.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
