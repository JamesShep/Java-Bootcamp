package com.coderscampus.lessons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("Week5/data.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("There was a file not found error");
            e.printStackTrace();
        } finally {
            try {
                System.out.println("Closing file reader");
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
