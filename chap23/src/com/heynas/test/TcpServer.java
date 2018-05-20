package com.heynas.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p> Description:  TcpServer </p>
 * <pre> </pre>
 * <p>
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TcpServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(30000);
        System.out.println("Server started!");

//        while (true) {
        Socket socket = ss.accept();
        System.out.println("Socket connected!");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String strLine = br.readLine();

        while ((strLine != null) && (!strLine.equals("bye"))) {
            System.out.println(strLine);

            bw.write("Server: " + strLine);
            bw.newLine();
            bw.flush();

            strLine = br.readLine();
        }

        br.close();
        bw.close();

//        Thread.sleep(1000);
//        }
    }
}
