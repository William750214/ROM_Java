package com.heynas.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * <p> Description:  TestNIO </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestFileLock {
    public static void main(String[] args) throws IOException, InterruptedException {
        File outFile = new File("d:/temp/def_UTF8.txt");

        FileChannel outChannel = new FileOutputStream(outFile).getChannel();

//        FileLock lock = outChannel.lock();
        FileLock lock = outChannel.tryLock();

        Thread.sleep(10000);

        lock.release();

        outChannel.close();
    }
}
