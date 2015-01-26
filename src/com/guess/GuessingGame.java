package com.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	static Random rand = new Random();
	
	// max number is the upward bound number
	public static final int MAX_NUMBER = 10;

	public static void main(String[] args) {
	
		int usersGuess; 
		int randomNumber; 
		int numberOfGuesses;
		String s;
				
		Scanner keyboard = new Scanner(System.in);
		
		keyboard.nextLine();		
		
		System.out.print("Guess a number less than "+MAX_NUMBER);
		usersGuess = keyboard.nextInt();
		
		numberOfGuesses = 1;

		randomNumber = getRandomNumber();

		// Respond to the user's usersGuess.
		while (usersGuess != randomNumber) {
		    
		    if (usersGuess < randomNumber) {
		        System.out.println("No, that's too low.");
		    } else if (usersGuess > randomNumber) {
		        System.out.println("Sorry, that's too high.");
		    }

		    // Ask again
		    System.out.print("Guess again: ");
		    usersGuess = keyboard.nextInt();

		    // Increment the usersGuess counter.
		    numberOfGuesses++;
		}
		
		System.out.println("Congratulations! You guessed it!");
		System.out.println("I was thinking of the number " + randomNumber + ".");
		System.out.println("You got it right in " + numberOfGuesses + " guesses.");		

	}
	
	public static int getRandomNumber () {
	    return rand.nextInt(MAX_NUMBER);
	}

}
