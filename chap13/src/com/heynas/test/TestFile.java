package com.heynas.test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Description:  TestFile<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
//		File file = new File("D:" + File.separator + "temp");
		File file = new File("D:" + File.separator + "temp" + File.separator + "abc.txt");
		File dir1 = new File("D:" + File.separator + "temp" + File.separator + "d1"+ File.separator + "d2" + File.separator + "d3");
//		File file = new File("." + File.separator + "abc.txt");
		File dir2 = new File("D:" + File.separator + "temp");

//		System.out.println(file.exists());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		System.out.println(file.isHidden());
//		System.out.println(file.isAbsolute());

//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getParent());
//
//		file.renameTo(new File(file.getParent() + File.separator + "efg.txt"));

//		file.setLastModified(file.lastModified() - 24 * 3600 * 1000);
//
//		System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault()));

//		System.out.println(file.length());

//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		File tempFile = File.createTempFile("abc","efg");
//
//		System.out.println(tempFile.getAbsolutePath());

//		file.deleteOnExit();
//		dir1.mkdirs();

//		String[] fileName = dir2.list();
//
//		for (int i = 0; i < fileName.length; i++) {
//			String s = fileName[i];
//			System.out.println(s);
//		}

		File[] files = dir2.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir.getPath() + File.separator + name);
				if (file.isDirectory()) {
					return  true;
				} else {
					return false;
				}
			}
		});

		for (int i = 0; i < files.length; i++) {
			File file1 = files[i];
			System.out.println(file1.getAbsolutePath());
		}

		System.out.println();



	}
}
