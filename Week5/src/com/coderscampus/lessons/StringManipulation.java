package com.coderscampus.lessons;

public class StringManipulation {

    public static void main(String[] args) {

        //static = belongs to the class itself, and not the instance
        //void = return type (nothing)
        //main = name of the method
        //string[] = array of strings (undefined length)
        for (String arg : args) {
            System.out.println(arg);

            //1,2,3,4,5 -> [0] = "1", [1] = "2", [2] = "3", [3] = "4", [4] = "5"

            String[] numbersArray = arg.split("-");
            for (String number : numbersArray) {
                System.out.println(number);
            }
        }
    }
}
