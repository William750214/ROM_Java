package com.heynas.test;

import com.heynas.bean.IPerson;
import com.heynas.bean.Person;

import java.lang.reflect.*;

/**
 * <p> Description:  TestReflect </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class clazz = Class.forName("com.heynas.bean.Person1");
        Class clazz = Person.class;

        Constructor[] constructors = clazz.getConstructors();
        Constructor constructor = clazz.getConstructor(String.class);

        Method[] methods = clazz.getMethods();
        Method method = clazz.getMethod("setName", String.class);
//        Method method = clazz.getDeclaredMethod("setName", String.class);

//        Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();

        System.out.println(clazz.getModifiers());

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        System.out.println(clazz.isInstance(new Person()));
        System.out.println(Person.class.isInterface());
        System.out.println(IPerson.class.isInterface());

        System.out.println(constructor.getParameterCount());
        System.out.println(method.getParameterCount());

        Parameter[] parameters = constructor.getParameters();

        Parameter parameter01 = parameters[0];

        System.out.println(parameter01.getType());
        System.out.println(parameter01.getName());
        System.out.println(parameter01.isNamePresent());

        Person person = (Person) constructor.newInstance("lisi");

//        method.setAccessible(true);
        method.invoke(person, "wangwu");

        Field nameField = fields[1];
        Field sexField = fields[3];

        nameField.setAccessible(true);
        nameField.set(person, "maliu");
        System.out.println(nameField.get(person));

        sexField.setAccessible(true);
        sexField.setBoolean(person, false);
        System.out.println(sexField.getBoolean(person));

        System.out.println();

        Field mapField = fields[4];
        mapField.setAccessible(true);

        System.out.println(mapField.getType());

        ParameterizedType ptype = (ParameterizedType)mapField.getGenericType();

        System.out.println(ptype);

        System.out.println(ptype.getRawType());

        Type[] types = ptype.getActualTypeArguments();

        System.out.println();

    }
}
