package com.heynas.test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * <p> Description:  TcpClient </p>
 * <pre> </pre>
 * <p>
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 30000);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//        bw.write("Hello Server");
//        bw.newLine();
//        bw.flush();
//
//        bw.close();
        Scanner scanner = new Scanner(System.in);
        String strLine = scanner.next();

        while (!strLine.equals("bye")) {
            bw.write(strLine);
            bw.newLine();
            bw.flush();

            System.out.println(br.readLine());

            strLine = scanner.next();
        }

        br.close();
        bw.close();
    }
}
