package com.heynas.test;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Description:  TestRandomAccessFile<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestRandomAccessFile {
	public static void main(String[] args) {
		File file = new File("D:" + File.separator + "temp" + File.separator + "abc4.txt");
		try {
			RandomAccessFile accessFile = new RandomAccessFile(file,"rw");

			System.out.println(System.getProperty("file.encoding"));
//			System.out.println((char)accessFile.readByte());
//			System.out.println((char)accessFile.readByte());

//			System.out.println(accessFile.getFilePointer());
//			accessFile.seek(7);

//			System.out.println(accessFile.readChar());
//			byte[] bytes = new byte[3];
//			accessFile.read(bytes);

//			System.out.println(new String(bytes));

//			System.out.println(accessFile.readUTF());

//			accessFile.writeChar('语');
//			accessFile.writeChar('言');
//			accessFile.write("语言".getBytes(Charset.forName("GBK")));
			accessFile.writeInt(100);
			accessFile.writeInt(200);
			accessFile.writeInt(300);
			accessFile.writeUTF("语言");

			System.out.println(accessFile.getFilePointer());

			accessFile.seek(0);

			System.out.println(accessFile.readInt());
			System.out.println(accessFile.readInt());
			System.out.println(accessFile.readInt());
			System.out.println(accessFile.readUTF());



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
