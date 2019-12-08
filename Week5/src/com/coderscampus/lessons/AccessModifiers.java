package com.coderscampus.lessons;

public class AccessModifiers {

    // Access Modifiers = private, public, protected
    public static void main(String[] args) {

        Human jamesSheppard = new Human();
        jamesSheppard.age = 26;

        System.out.println(jamesSheppard.getStageOfLife());
    }
}