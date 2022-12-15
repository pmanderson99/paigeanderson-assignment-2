package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int winningNumber = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		boolean correctValue = false;
		int playersGuess = 0;
		
		System.out.println("Welcome. Pick a number between 1 and 100.");
		
		while (playersGuess < 5) {
			int userInput = scanner.nextInt();
			if (userInput < 1 || userInput > 100) {
				System.out.println("Error. Guess is outside of expected range. Try again.");
			} 
			else if (userInput < winningNumber) {
				System.out.println("Please pick a higher number.");
				playersGuess++;
			}
			else if (userInput > winningNumber) {
				System.out.println("Please pick a lower number.");
				playersGuess++;
			}
			else {
				correctValue = true;
				break;
			}
			
		}
		if (correctValue) {
			System.out.println("Congratulations! You win!");
		}
		else {
			System.out.println("Game over. You're out of guesses.");
			System.out.println("The correct number to guess was: " + winningNumber);
		}
		
	}

}
