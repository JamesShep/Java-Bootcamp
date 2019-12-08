package com.coderscampus.lessons;

public class UserApplication {

    public static void main(String[] args) {

        UserService userService = new UserService();

        User jamesUser = userService.createUser("JamesShep", "password123");
        System.out.println(jamesUser);
    }

}
