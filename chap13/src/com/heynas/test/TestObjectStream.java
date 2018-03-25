package com.heynas.test;

import com.heynas.bean.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <p> Description:  TestObjectStream </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestObjectStream {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(18);
        person.setSex(true);

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\temp\\zhangsan.obj"));
//        oos.writeObject(person);
//
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\temp\\zhangsan.obj"));
        Person person1 = (Person) ois.readObject();

        System.out.println(person1);

    }
}
