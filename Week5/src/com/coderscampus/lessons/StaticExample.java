package com.coderscampus.lessons;

public class StaticExample {

    int someNumber = 10;

    public static void main (String [] args) {

        //staic = belongs to the class, but not the instance of the class

        //in this case, the 'main' method is marked as static.
        //the main method belong to the class 'StaticExample'

        //non static (no static word) means it belongs to an instance of the class
        //(not the class itself)

        StaticExample staticObject = new StaticExample();


        if (staticObject.someNumber > 11) {
            System.out.println("say something");
        }

        Human aChild = new Human();
        aChild.age = 12;
        System.out.println(aChild.getStageOfLife());

        Human anAdult = new Human();
        anAdult.age = 19;
        System.out.println(anAdult.getStageOfLife());

        //since we are creating an instance, we can access the non static method in human.java

        //we cannot do

        //Human.getStageOfLife();
        //we need to create an instance of aChild
    }

}
