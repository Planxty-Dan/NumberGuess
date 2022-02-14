package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /Users/dannewport/Projects/Roam/NumberGuess
        //        Create a new project in IntelliJ named NumberGuess
//        Create an int property for targetNumber and assign it a value between 1 and 10
//        Using a while loop, get user input in the console to guess a number
//        If the number guessed is equal to targetNumber, congratulate the user and end the loop
//        If the number is not equal to targetNumber, allow the loop to repeat until the user guesses the correct number
//        Bonus: Find a way to assign a random number between 1 and 10 as the value of targetNumber
//        Super Bonus: If the user inputs a number that is not between 1 and 10 tell them the input is invalid and ask for a new number

        int targetNumber = 5;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10");
        int num1 = myScanner.nextInt();
        boolean keepGuessing = true;

        while (keepGuessing == true) {

            if (num1 == targetNumber) {
                System.out.println("Lucky Guess!");
                keepGuessing = false;
            } else {
                System.out.println("Better luck next time, please guess again");
                num1 = myScanner.nextInt();
            }
        }
    }
}
