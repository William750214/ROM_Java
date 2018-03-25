package com.heynas.user;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p> Description:  UserManagerInvocationHandler </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class UserManagerInvocationHandler implements InvocationHandler {
    private UserManager userManager;

    public UserManagerInvocationHandler(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before Add!");

        method.invoke(userManager,args);

        System.out.println("After Add!");

        return null;

    }
}
