package com.heynas.test;

import com.heynas.user.UserManager;
import com.heynas.user.UserManagerImpl;
import com.heynas.user.UserManagerInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p> Description:  TestUserManager </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestUserManager {
    public static void main(String[] args) {
        /*
         * 静态代理
         */
//        UserManager userManager = new UserManagerProxy(new UserManagerImpl());
//
//        userManager.addUser("zhangsan");
        /*
         * 动态代理
         */
        InvocationHandler handler = new UserManagerInvocationHandler(new UserManagerImpl());

        UserManager userManager = (UserManager) Proxy.newProxyInstance(
                UserManager.class.getClassLoader(), new Class[]{UserManager.class}, handler);

        userManager.addUser("zhangsan");
    }
}
