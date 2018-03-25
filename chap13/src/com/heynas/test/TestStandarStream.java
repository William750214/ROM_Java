package com.heynas.test;

import java.io.*;

/**
 * <p> Description:  TestStandarStream </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestStandarStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\temp\\abc_UTF8.txt");
        FileOutputStream fos = new FileOutputStream("d:\\temp\\fileout.txt");
        FileOutputStream fos_err = new FileOutputStream("d:\\temp\\fileout_err.txt");

        System.setIn(fis);
        System.setOut(new PrintStream(fos));
        System.setErr(new PrintStream(fos_err));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strLine = br.readLine();

        while (strLine != null) {
            System.err.println(strLine);
            strLine = br.readLine();
        }

        br.close();
        fis.close();
        fos.close();
    }
}
