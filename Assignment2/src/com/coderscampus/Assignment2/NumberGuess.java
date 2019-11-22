package com.coderscampus.Assignment2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main (String [] args) {

        //setup of scanner object
        Scanner input = new Scanner(System.in);

        //variables
        final int MAX_NUMBER = 101;
        final int MIN_NUMBER = 0;
        int numberOfGuesses = 5;
        int playerGuessNumber = 0;
        int randomNumber;
        int playerGuess;

        //setup of random number object, and assigning max limit
        Random random = new Random();
        randomNumber = random.nextInt(MAX_NUMBER);
        //Below line was added for testing
        //System.out.println(randomNumber);

        //Add +1 if random number is 0 (0 is not allowed for the assignment)
        if (randomNumber == 0) {
            randomNumber++;
        }

        //Start of while loop, looping to value set in numberOfGuesses (5)
        while (playerGuessNumber < numberOfGuesses) {
            System.out.println("Please pick a number between 1 and 100 (Inclusive)");
            playerGuess = input.nextInt();

            if (playerGuess <= MIN_NUMBER || playerGuess >= MAX_NUMBER) {
                System.out.println("Your guess is not between 1 and 100, please try again");
            }
            else if (playerGuess > randomNumber) {
                System.out.println("Please pick a lower number");
                playerGuessNumber++;
            }
            else if(playerGuess < randomNumber) {
                System.out.println("Please pick a higher number");
                playerGuessNumber++;
            }
            else {
                System.out.println("Your guess of " + playerGuess + " is correct!");
                break;
            }
        }
        if (playerGuessNumber == (numberOfGuesses)) {
            System.out.println("Your lose!");
            System.out.println("The number to guess was: " + randomNumber);
        }
    }
}