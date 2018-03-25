package com.heynas.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

/**
 * <p> Description:  TestProcessBuilder </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestProcessBuilder {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command("cmd","/C","javac");

        processBuilder.directory(new File("d:\\"));

        processBuilder.redirectErrorStream(true);

        Map mapEnv = processBuilder.environment();
//        mapEnv.clear();

        for (Iterator iterator = mapEnv.keySet().iterator(); iterator.hasNext(); ) {
            String key = (String) iterator.next();
            String value = (String) mapEnv.get(key);
            System.out.println(key + "=" + value);
        }

        Process process = processBuilder.start();

                BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream(),"GBK"));

        String strLine = br.readLine();

        while (strLine != null) {
            System.out.println(strLine);
            strLine = br.readLine();
        }

        br.close();
    }
}
