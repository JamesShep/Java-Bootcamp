package com.coderscampus.objects;

public class RunnableClass {
    public static void main(String [] args)
    {
        // Class -> Blueprint for an Object
        // Object -> a Noun, it's an instantiation of a Class

        //Data type, variable name, assignment operation
        int someNumber = 39;

        Human jamesSheppard = new Human();
        jamesSheppard.setProperties("male", "6' 3\"", "80", "hazel");

        System.out.println(jamesSheppard.getInfo());

        Human elonMusk = new Human();
        elonMusk.setProperties("male", "6 '1\"", "90", "green");

        System.out.println(elonMusk.getInfo());

        Human elleHeffernan = new Human();
        elleHeffernan.setProperties("female", "5' 9\"", "60", "blue");

        System.out.println(elleHeffernan.getInfo());
    }

}
