package com.coderscampus.lessons;

//POJO = Plain Old Java Object
public class User {

    // instance variables (declared as private)
    // they are instance variables because they are created per instance (multi user)
    // if they were static, would be tied to the class. And would be the same for all users
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int unseccessfulLoginAttempts;

    //getters and setters for the above instance variables


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUnseccessfulLoginAttempts() {
        return unseccessfulLoginAttempts;
    }

    public void setUnseccessfulLoginAttempts(int unseccessfulLoginAttempts) {
        this.unseccessfulLoginAttempts = unseccessfulLoginAttempts;
    }
}
