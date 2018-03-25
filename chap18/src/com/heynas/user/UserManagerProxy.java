package com.heynas.user;

/**
 * <p> Description:  UserManagerProxy </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class UserManagerProxy implements UserManager {
    private UserManager userManager;

    public UserManagerProxy(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public void addUser(String userName) {
        System.out.println("Before add!");

        userManager.addUser(userName);

        System.out.println("After add!");
    }
}
