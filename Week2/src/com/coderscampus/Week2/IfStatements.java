package com.coderscampus.Week2;

import java.util.Scanner;

public class IfStatements
{
    static public void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        //variable type/Class, variable name = scanner is equal to
        //when taking a blueprint(class), you need to create it with the new tag, and variable name
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("What is your age?");
        String userAge = input.nextLine();

        if(userName.equals("James") && userAge.equals("26"))
        {
            System.out.println("Holy cow, it's me!");
        }
        else
        {
            System.out.println("Hello: " + userName);
        }

        input.close();




    }
}



//
//        int age = 21;
//
//        if (age >= 19)
//        {
//            System.out.println("You are an adult.");
//        }
//        else if (age >= 13)
//        {
//            System.out.println("You are a teenager");
//        }
//        else if (age == 12)
//        {
//            System.out.println("You are a pre-teen");
//        }
//        else
//        {
//            System.out.println("You are a child");
//        }
//
//        String output = ("Your age is " + age);
//        System.out.println(output);
//
//        if (output.equals("Your age is 18"))
//        {
//            System.out.println("Yay you can vote!");
//        }
//        else if (output.equals("Your age is 21"))
//        {
//            System.out.println("Yay you can drink / gamble");
//        }
//    }



//Use .equals when dealing with objects
//use == when dealing with primitive data types (int)