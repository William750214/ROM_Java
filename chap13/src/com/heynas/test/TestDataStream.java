package com.heynas.test;

import java.io.*;

/**
 * Created by William on 2017/6/11.
 */
public class TestDataStream {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("d:\\temp\\student.dat");
//            FileOutputStream fos = new FileOutputStream("d:\\temp\\student.dat");

            DataInputStream dis = new DataInputStream(fis);
//            DataOutputStream dos = new DataOutputStream(fos);

//            dos.writeUTF("name");
//            dos.writeUTF("age");
//            dos.writeUTF("sex");
//            dos.writeUTF(System.lineSeparator());
//
//            dos.writeUTF("张三");
//            dos.writeInt(18);
//            dos.writeBoolean(true);
//            dos.writeUTF(System.lineSeparator());
//
//            dos.writeUTF("李四");
//            dos.writeInt(19);
//            dos.writeBoolean(false);
//            dos.writeUTF(System.lineSeparator());
//
//            dos.close();

            System.out.print(dis.readUTF() + "    ");
            System.out.print(dis.readUTF()  + "    ");
            System.out.print(dis.readUTF()  + "    ");
            System.out.print(dis.readUTF());

            System.out.print(dis.readUTF() + "    ");
            System.out.print(dis.readInt()  + "    ");
            System.out.print(dis.readBoolean()  + "    ");
            System.out.print(dis.readUTF());

            System.out.print(dis.readUTF() + "    ");
            System.out.print(dis.readInt()  + "    ");
            System.out.print(dis.readBoolean()  + "    ");
            System.out.print(dis.readUTF());

            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
