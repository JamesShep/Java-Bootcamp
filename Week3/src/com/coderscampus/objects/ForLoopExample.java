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

    void incrementExample1() {
        System.out.println("Incrementing Example");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        System.out.println("Decrementing Example");
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }
    }

    void incrementExample2(int j) {
        System.out.println("Inside incrementExample2 method: j = " + j);

    }

}
