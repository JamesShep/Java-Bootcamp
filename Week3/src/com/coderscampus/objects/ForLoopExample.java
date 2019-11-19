package com.coderscampus.objects;

public class ForLoopExample {

    void forLoopExample() {

        System.out.println("Square roots");

        //Initialisation; Termination condition; Increment
        int a = 0;
        for (int i = 0; i < 10; i++)
        {
            System.out.print(i + ": ");
            System.out.println(i*i);
        }

        System.out.println("For loop completed");
    }

}
