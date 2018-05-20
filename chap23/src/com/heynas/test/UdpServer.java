package com.heynas.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * <p> Description:  UdpServer </p>
 * <pre> </pre>
 * <p>
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(3333);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        ds.receive(dp);

        String info = new String(dp.getData(), 0, dp.getLength());
        System.out.println(info);

    }
}
