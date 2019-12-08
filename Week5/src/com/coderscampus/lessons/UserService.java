package com.coderscampus.lessons;

public class UserService {

    public User createUser (String username, String password) {

        //datatype variable name assignment operator

        User user = new User();
        // same format as
        // Scanner scanner = new Scanner(System.in);
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName("John");
        user.setLastName("Doe");
        return user;
    }

}
