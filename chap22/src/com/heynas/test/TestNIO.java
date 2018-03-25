package com.heynas.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p> Description:  TestNIO </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestNIO {
    public static void main(String[] args) throws IOException {
        File inFile = new File("d:/temp/abc_UTF8.txt");
        File outFile = new File("d:/temp/def_UTF8.txt");

        FileChannel inChannel = new FileInputStream(inFile).getChannel();
        FileChannel outChannel = new FileOutputStream(outFile).getChannel();

//        ByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inFile.length());
//
//        outChannel.write(buffer);

        ByteBuffer buffer = ByteBuffer.allocate(8);

        while(inChannel.read(buffer) != -1) {
            buffer.flip();

            outChannel.write(buffer);

            buffer.clear();
        }


        inChannel.close();
        outChannel.close();
    }
}
