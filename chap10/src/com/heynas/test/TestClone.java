package com.heynas.test;

import com.heynas.bean.Person;

import java.util.Arrays;
import java.util.Date;

/**
 * Description:  TestClone<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Integer[] grades01 = {70, 80, 90};
        Integer[] grades02 = grades01;
        Integer[] grades03 = grades01.clone();

        Integer[] grades04 = new Integer[grades01.length];

        for (int i = 0; i < grades04.length; i++) {
            grades04[i] = grades01[i];
        }

        grades01[0] = 100;

        System.out.println(Arrays.toString(grades01));
        System.out.println(Arrays.toString(grades02));
        System.out.println(Arrays.toString(grades03));
        System.out.println(Arrays.toString(grades04));

        Date date01 = new Date();
        Date date02 = (Date) date01.clone();

        Person person1 = new Person("zhangsan", 18, true);
        person1.setGrades(new Integer[]{70, 80, 90});
        Person person2 = (Person) person1.clone();

        person1.setName("Lisi");
        person1.getGrades()[0] = 100;

        System.out.println(person1.toString());
        System.out.println(person2.toString());


    }
}
