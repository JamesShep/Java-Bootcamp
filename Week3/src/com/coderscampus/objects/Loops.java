package com.coderscampus.objects;

import java.awt.*;

public class Loops {

    public static void main(String [] args) {

        int j = 0;

//        ForLoopExample forExample = new ForLoopExample();
//        example.forLoopExample();

//        WhileLoopExample whileExample1 = new WhileLoopExample();
//        whileExample.whileLoopExample1();
//        whileExample.whileLoopExample2();

        ForLoopExample forExample = new ForLoopExample();
//        forExample.incrementExample1();
        forExample.incrementExample2(j++);
        System.out.println("Outside method j = " + j);

    }

}
