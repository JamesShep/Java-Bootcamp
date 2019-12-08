package com.coderscampus.lessons;

public class AccessModifiers {

    // Access Modifiers = private, public, protected
    public static void main(String[] args) {

        Human jamesSheppard = new Human();
        jamesSheppard.setAge(-1);
        System.out.println(jamesSheppard.getAge());
        jamesSheppard.setAge(140);
        System.out.println(jamesSheppard.getAge());
        jamesSheppard.setAge(26);
        System.out.println(jamesSheppard.getAge());
    }
}