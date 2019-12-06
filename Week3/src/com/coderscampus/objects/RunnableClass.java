package com.coderscampus.objects;

import java.util.Random;

public class RunnableClass {
    public static void main(String [] args)
    {
        // Class -> Blueprint for an Object
        // Object -> a Noun, it's an instantiation of a Class

        //Data type, variable name, assignment operation
        Random random = new Random();

//        for (int i = 0; i<20; i++)
//            System.out.println("random number is : " + random.nextInt(10));

        //Call the no argument constructor
        Human someOtherHuman = new Human ();

        //Call the 4 argument constructor
        Human jamesSheppard = new Human("male", "6' 3\"", "80", "hazel");

        System.out.println(jamesSheppard.getInfo());

        Human elonMusk = new Human("male", "6 '1\"", "90", "green");

        System.out.println(elonMusk.getInfo());

        Human elleHeffernan = new Human("female", "5' 9\"", "60", "blue");

        System.out.println(elleHeffernan.getInfo());
    }

}
