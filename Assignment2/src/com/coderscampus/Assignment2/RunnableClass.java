package com.coderscampus.Assignment2;

import java.util.Random;
import java.util.Scanner;

public class RunnableClass {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        int numberOfGuesses = 5;
        int playerGuessNumber = 0;
        int randomNumber;
        int playerGuess = 0;

        Random random = new Random();

        randomNumber = random.nextInt(101);
        if (randomNumber == 0) {
            randomNumber++;
        }

        while (playerGuessNumber < numberOfGuesses) {
            System.out.println("Please pick a number between 1 and 100 (Inclusive)");
            playerGuess = input.nextInt();

            if (playerGuess <= 0 || playerGuess >= 101) {
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
