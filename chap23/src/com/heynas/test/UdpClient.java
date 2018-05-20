package com.heynas.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * <p> Description:  UdpClient </p>
 * <pre> </pre>
 * <p>
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class UdpClient {
    public static void main(String[] args) throws IOException {
        String info = "hello world!";
        DatagramSocket ds = new DatagramSocket();

        DatagramPacket dp = new DatagramPacket(info.getBytes(), info.length(),
                InetAddress.getByName("127.0.0.1"), 3333);

        ds.send(dp);

    }
}
