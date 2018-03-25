package com.heynas.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p> Description:  TestProcess </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestProcess {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

//        Process process = runtime.exec("cmd /C dir");
        Process process = runtime.exec("cmd /C javac");

//        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream(),"GBK"));

        String strLine = br.readLine();

        while (strLine != null) {
            System.out.println(strLine);
            strLine = br.readLine();
        }

        br.close();
    }
}
