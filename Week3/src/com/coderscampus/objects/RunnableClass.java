package com.coderscampus.objects;

public class RunnableClass {
    public static void main(String [] args)
    {
        // Class -> Blueprint for an Object
        // Object -> a Noun, it's an instantiation of a Class

        //Data type, variable name, assignment operation
        int someNumber = 39;

        Human jamesSheppard = new Human();

        jamesSheppard.eyeColour = "hazel";
        jamesSheppard.gender = "male";
        jamesSheppard.height = "6' 3\"";
        jamesSheppard.weight = "80";

        System.out.println(jamesSheppard.getInfo());

        Human elonMusk = new Human();
        elonMusk.eyeColour = "blue";
        elonMusk.gender = "male";
        elonMusk.height = "6' 1\"";
        elonMusk.weight = "90";

        System.out.println(elonMusk.getInfo());

        Human elleHeffernan = new Human();
        elleHeffernan.eyeColour = "blue";
        elleHeffernan.gender = "female";
        elleHeffernan.height = "5' 9\"";
        elleHeffernan.weight = "60";

        System.out.println(elleHeffernan.getInfo());
    }

}
