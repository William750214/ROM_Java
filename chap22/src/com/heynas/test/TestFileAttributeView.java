package com.heynas.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * <p> Description:  TestFileAttributeView </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestFileAttributeView {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("d:/temp/abc.pptx");

        BasicFileAttributeView basicFileAttributeView
                = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        BasicFileAttributes basicFileAttributes = basicFileAttributeView.readAttributes();

        System.out.println(basicFileAttributes.isDirectory());
        System.out.println(basicFileAttributes.creationTime());
        System.out.println(basicFileAttributes.size());
        System.out.println(basicFileAttributes.lastModifiedTime());
    }
}
