package day7;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Number guessing game - max attempt - 3
		
		Scanner scanner = new Scanner (System.in);
		// To generate random number between 1 and 100 - we will discuss more in later class
		Random random = new Random(); // create a new class Random
		int targetNumber = random.nextInt(10)+1; // random number between 1 and 10
		
		
		int attempts = 5;
		boolean guessCorrectly = false;
		
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Guess a number between 1 and 10");
		System.out.println("You have " +attempts+ " attemps. Good luck!");
		
		for(int i=1; i<=attempts;i++)
		{
			System.out.println("Attempt" +i+ ": Enter your guess: ");
			int userGuess = scanner.nextInt();
			
			if (userGuess==targetNumber)
			{
				System.out.println("Congratulation! You guessed the correct number");
				guessCorrectly = true;
				break;
			}
			else
				System.out.println("X Wrong guess");
			    if (i<attempts)
			    {
			    	System.out.println("Try again!");
			    }
		}
		
		if (!guessCorrectly)
		{
			System.out.println("You've used all attempts. The correct number was: "+targetNumber);
		}
		scanner.close();

	}


}
