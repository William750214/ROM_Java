package com.heynas.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

/**
 * <p> Description:  BaseNetworkSupportClass </p>
 * <pre> </pre>
 * <p>
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class BaseNetworkSupportClass {
    public static void main(String[] args) throws IOException {
        InetAddress ip1 = InetAddress.getByName("www.baidu.com");

        InetAddress ip2 = InetAddress.getByAddress(new byte[]{10, 0, 1, (byte) 217});

        System.out.println(ip1.isReachable(1000));
        System.out.println(ip2.isReachable(1000));

        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println(URLEncoder.encode("&", "UTF-8"));
        System.out.println(URLDecoder.decode("%26", "UTF-8"));

        URL url = new URL("https://code.jquery.com/jquery-3.3.1.min.js");

        System.out.println(url.getFile());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getQuery());

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        InputStream inputStream = conn.getInputStream();

        FileOutputStream outputStream = new FileOutputStream("d:/temp/jquery.min.js");

        byte[] buffer = new byte[1024];
        while (inputStream.read(buffer) != -1) {
            outputStream.write(buffer);
        }

        inputStream.close();
        outputStream.close();
    }
}
