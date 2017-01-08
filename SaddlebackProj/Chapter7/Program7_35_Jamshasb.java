/* Chapter No. 7 - Exercise No.  35
File Name:          Program7_35_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 27, 2016

Problem Statement: To play a simple game of hangman

Overall Plan:
1. Generate a random word and create an array that is only of stars
2. Prompt the user to enter a letter
3. Call a method to check if the letter is in the word
4. Call another method that changes the array of stars
5. Repetively prompts the user to guess while checking if the user has guessed the word or to check if the user has lost the game
6. If the user wins, prompt the user to play again. If he loses, quit the game.
7. Display the hangman before each attempt

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
fails 		int 			any int 		to help check for mistakes
guess 		char 			any char 		the guess that the user inputs
guess1 		String 			any String 		it is the input from the user but it is cut down to char. Used to check if the user inputs only one letter
i 			int 			any int 		the variable for the condition in the for loop
mistakes 	int 			0-6 			the amount of times that the user messes up
scan 		Scanner 		user input 		allows user input
startUp 	boolean 		true/false	 	the variable to see if it should reset all the values in the program
theWord[] 	char/array 		any chars 		an array that at each value is a letter
winNum 		int 			any int 		to check if the user has won the game
word 		String 			any String 		the random word that the computer picked
words[] 	String/array 	any Strings 	the list of Strings that will be randomely picked
*/
import java.util.Scanner;

public class Program7_35_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] words = {"program", "starwars", "mickey", "apple", "branch", "blue", "carpet", "java", "saddleback", "library", "computer"};
		char[] theWord;
		String word, guess1; //The random word out of the array of words
		boolean startUp = false;
		char guess;
		int winNum, fails;
		int mistakes = 0;
		word = words[(int)(Math.random()*words.length)]; //Random word from this list
		theWord = starryNight(word); //Make the word all stars
		
		do {
			//Startup for a new game
			if (startUp) {
				mistakes = 0; //Reset mistakes to zero
				word = words[(int)(Math.random()*words.length)]; //A new random word from this list
				theWord = starryNight(word); //Make the new word all stars
				startUp = false; //So it doesn't do it again
			}

				System.out.println("");

			//To check if the user exceeded their tries
			if (mistakes == 6) {
				//Print the picture of the hanging man
				picture(mistakes);
				System.out.println("The word was " + word + ". You lose");
				break;
			}

			// To check if the user has won
			winNum = 0;
			for (int i = 0; i < word.length(); i++) {
				if(makeWinWord(word)[i] == theWord[i]) {
					winNum++;
				}
			} 
			if (winNum == word.length()) {
				System.out.println("The word is " + word + ". You missed " + mistakes + " time(s)");
				System.out.println("Do you want to guess another word? <y/n>: ");
				guess = scan.next().toLowerCase().charAt(0);
				if (guess == 'y'){
					startUp = true;
					continue;
				} else if (guess == 'n') {
					break;
				} else {
					System.out.println("Invalid input");
					break;
				}
			}

		//Start the printing
			//Check if the user inputed one letter
			do {

			//Print the picture of the hanging man
			picture(mistakes);
				//Prompt the user to give their guess
				System.out.print("(Guess) Enter a letter in word ");

				//Printing the array to the user
				for (int i = 0; i < word.length(); i++)
					System.out.print(theWord[i]);
				System.out.print(": ");

				//Gets the user's guess
				guess1 = scan.next().toLowerCase(); //Convert the string into a char

				if (guess1.length() > 1 || guess1.charAt(0) < 97 || guess1.charAt(0) > 122) {
					System.out.println("**ERROR** Invalid entry");
				} else {
					guess = guess1.charAt(0);
					break;
				}
			
			} while(true);

			// To check if the user has lost and if there is a repeated letter
			fails = 0;
			for (int i = 0; i < word.length(); i++) {
				if(makeWinWord(word)[i] != guess) {
					fails++;
				} else if (theWord[i] == guess) {
					System.out.println("\t" + guess + " is already in the word");
					break;
				}
			}

			//Change the blank for the print statment
			theWord = changeBlank(guess, word, theWord);

			//Check if the input is valid
			if (fails == word.length()) {
				System.out.print("\t" + guess + " is not a valid. You have: ");
				mistakes++;
				System.out.println((6 - mistakes) + " attemps left.");
				continue;
			}
			 	

		} while (true);


	}

	//Make the original array all stars
	/************************************************/
	/* Name: starryNight(String word) 				*/
	/************************************************/
	/* Purpose: to create an array with stars 		*/
	/* Parameters: 									*/
	/*	String word 								*/
 	/* Return: 	an array with only stars			*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	blanks[] 	char/array 		*'s 				an array of only stars
	*/
	public static char[] starryNight(String word) {
		char[] blanks = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			blanks[i] = '*';
		}
		return blanks;
	}

	//Change the original array with the stars with letters
	/************************************************/
	/* Name: changeBlank(char guess, String word, char[] theWord)*/
	/************************************************/
	/* Purpose: to change the stars into the letters*/
	/* Parameters: 									*/
	/*	char guess 									*/
	/* 	String word									*/
	/* 	char[] theWord								*/
 	/* Return: to return an array with stars 		*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable condition for the for loop	
	*/
	public static char[] changeBlank(char guess, String word, char[] theWord) {
		for (int i = 0; i < word.length(); i++) 
			if (word.charAt(i) == guess) 
				theWord[i] = guess;

		return theWord;
	}

	//Create an array for the winning word
	/************************************************/
	/* Name: makeWinWord(String word) 				*/
	/************************************************/
	/* Purpose: to create the winning word as an array*/
	/* Parameters: 									*/
	/*	String word 								*/
 	/* Return: 	the winning word as an array		*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	winner[] 	String/array 	any String 		the winning word as an array
	*/
	public static char[] makeWinWord(String word) {
		char[] winner = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			winner[i] = word.charAt(i);
		}
		return winner;
	}

	//Printing the hanging man
	/************************************************/
	/* Name: picture(int mistakes) 					*/
	/************************************************/
	/* Purpose: to print the hangman to the user 	*/
	/* Parameters: 									*/
	/*	int mistakes 								*/
 	/* Return: 	N/A 					 			*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A 		N/A 			N/A 			N/A 		
	*/
	public static void picture(int mistakes) {
		switch (mistakes) {
			case 1: 
				System.out.println("  ________");
				System.out.println("  |    \\ |");
				System.out.println("  O     \\|");
				System.out.println("         |");
				System.out.println("         |");
			    System.out.println("         |");
				System.out.println("--------------");
				break;
			case 2: 
				System.out.println("  ________");
				System.out.println("  |    \\ |");
				System.out.println("  O     \\|");
				System.out.println("  |      |");
				System.out.println("         |");
			    System.out.println("         |");
				System.out.println("--------------");
				break;
			case 3: 
				System.out.println("  ________");
				System.out.println("  |    \\ |");
				System.out.println("  O     \\|");
				System.out.println(" /|      |");
				System.out.println("         |");
			    System.out.println("         |");
				System.out.println("--------------");
				break;
			case 4: 
				System.out.println("  ________");
				System.out.println("  |    \\ |");
				System.out.println("  O     \\|");
				System.out.println(" /|\\     |");
				System.out.println("         |");
			    System.out.println("         |");
				System.out.println("--------------");
				break;
			case 5: 
				System.out.println("  ________");
				System.out.println("  |    \\ |");
				System.out.println("  O     \\|");
				System.out.println(" /|\\     |");
				System.out.println(" /       |");
			    System.out.println("         |");
				System.out.println("--------------");
				break;
			case 6: 
				System.out.println("  ________");
				System.out.println("  |    \\ |");
				System.out.println("  O     \\|");
				System.out.println(" /|\\     |");
				System.out.println(" / \\     |");
			    System.out.println("         |");
				System.out.println("--------------");
				break;
			default: 
				System.out.println("  ________");
				System.out.println("  |    \\ |");
				System.out.println("        \\|");
				System.out.println("         |");
				System.out.println("         |");
			    System.out.println("         |");
				System.out.println("--------------");
				break;
		}
	}
}