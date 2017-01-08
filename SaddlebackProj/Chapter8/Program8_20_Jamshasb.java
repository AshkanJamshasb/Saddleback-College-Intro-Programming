/* Chapter No. 8 - Exercise No.  20
File Name:          Program8_20_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 1, 2016

Problem Statement: Allows the user to play connect four with a second player

Overall Plan:
1. Prompt the users to enter their place they would like to play
2. Once the user plays, the game goes through a series of methods to check if the place was valid and to push the piece to the bottom
3. It goes through a series of for loops to check if a user has won 
4. Goes through horizontally, then vertically, and finally checks if a user has won diagonally, constantly checking if there are four pieces in a row.
5. If the user has won, display which user wins and exits the system.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
moves 		int 			0-44 			to count how many moves the yser has made
place 		int 			0-6				the place the user chose to drop their move
player 		char 			'R'/'Y' 		the player that the user is
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;
public class Program8_20_Jamshasb {

	public static void main(String[] args) {

		char player;
		int place, moves = 0;
		Scanner scan = new Scanner(System.in);

		char[][] board = {{' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '},};	
		displayBoard(board);				 
		do {
			if (moves < 42) {
				do {
					System.out.print("Drop a red disk at column (0-6): ");
					place = scan.nextInt();
					scan.nextLine();
					if (badPlace(place)) {
						System.out.println("**ERROR** Invalid input");
						continue;
					}
					placeChoice(place, board, 'R');
					displayBoard(board);
					checkHorizontalWinner(board);
					checkVerticalWinner(board);
					checkDiagonalWinner(board);
					break;
				} while (true);

				do {
					System.out.print("Drop a yellow disk at column (0-6): ");
					place = scan.nextInt();
					scan.nextLine();
					if (badPlace(place)){
						System.out.println("**ERROR** Invalid input");
						continue;
					}
					placeChoice(place, board, 'Y');
					displayBoard(board);
					checkDiagonalWinner(board);
					checkHorizontalWinner(board);
					checkVerticalWinner(board);
					break;
				} while (true);	
			} else {
				System.out.println("Tie Game");
				System.exit(1);
			}
			moves += 2;
		} while (true);
	}

	/************************************************/
	/* Name: displayBoard(char board[][]) 		 	*/
	/************************************************/
	/* Purpose: To display the board to the user 	*/
	/* Parameters: 									*/
	/*	char board[][] 								*/
 	/* Return: N/A 									*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	column 		int 			0-7 			the number of column
	row 		int 			0-6				the number of rows
	*/
	public static void displayBoard(char board[][]) {
		int row,  column;
		row = column = 0;
		System.out.println("");
		System.out.println(" 0 1 2 3 4 5 6");
		for (row = 0; row < 6; row++) {
			for (column = 0; column < 7; column++) {
				System.out.print("|" + board[row][column]);
			}
			System.out.println("|");
		}
		System.out.println("---------------");
	}

	/************************************************/
	/* Name: badPlace(int place) 				 	*/
	/************************************************/
	/* Purpose: To see if the place is a correct place */
	/* Parameters: 									*/
	/*	double[][] a 								*/
	/* 	double[][] b 								*/
 	/* Return: true/false 							 */
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A 		N/A 			N/A 			N/A
	*/
	public static boolean badPlace(int place) {
		if (place < 0 || place > 6) {
			return true; 
		} else {
			return false;
		}
	}

	/************************************************/
	/* Name: placeChoice(int place, char[][] board, char player) */
	/************************************************/
	/* Purpose: To add the numbers in the matrixes  */
	/* Parameters: 									*/
	/*	int place 	 								*/
	/* 	char[][] board 								*/
	/*  char player 								*/
 	/* Return: N/A 									*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	clear 		int 			0-7 			to check if there has been a pice played before
	row 		int 			0-6 		 	to check if there is any clear places
	scan 		Scanner 		user input 		allows user input
	*/
	public static void placeChoice(int place, char[][] board, char player) {
		int row;
		int clear = 0;
		Scanner scan = new Scanner(System.in);
		do {
			if (board[0][place] != ' ') {
				System.out.println("**ERROR** Invalid input\nDrop a disk at column (0-6): ");
				place = scan.nextInt();
			} else {
				for (row = 0; row < 6; row++) {
					if (board[row][place] == ' ') {
						clear++;
					} else {
						board[(row-1)][place] = player;
						break;
					}
					if (clear == 6) {
						board[row][place] = player;
					}
				}
				break;
			}
		} while (true);
	}

	/************************************************/
	/* Name: checkHorizontalWinner (char[][] board)	*/
	/************************************************/
	/* Purpose: To check if the horizontal wins 	*/
	/* Parameters: 									*/
	/*	char[][] board 								*/
 	/* Return: N/A 									*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	column 		int 			0-7 			the number of columns
	redCount 	int 			0-4 			the count to see if horizontal won
	row 		int 			0-4 			the number of rows
	yelCount 	int 			0-4 			the count to see if horizontal won
	*/
	public static void checkHorizontalWinner (char[][] board) {
		int redCount = 0;
		int yelCount = 0;
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 7; column++) {
				if (board[row][column] == 'R') {
					redCount += 1;
					if (redCount == 4) {
						System.out.println("Red Wins!");
						System.exit(1);
					}
				} else {
					redCount = 0;
				}
				if (board[row][column] == 'Y') {
					yelCount += 1;
					if (yelCount == 4) {
						System.out.println("Yellow Wins!");
						System.exit(1);
					}
				} else {
					yelCount = 0;
				}
			}
			redCount = 0;
			yelCount = 0;
		}
	}

	/************************************************/
	/* Name: checkVerticalWinner (char[][] board) 	*/
	/************************************************/
	/* Purpose: To check if there is a vertical winner */
	/* Parameters: 									*/
	/*	char[][] board								*/
 	/* Return: N/A 									*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	column 		int 			0-7 			the number of columns
	redCount 	int 			0-4 			the count to see if horizontal won
	row 		int 			0-4 			the number of rows
	yelCount 	int 			0-4 			the count to see if horizontal won
	*/
	public static void checkVerticalWinner (char[][] board) {
		int redCount = 0;
		int yelCount = 0;
		for (int column = 0; column < 7; column++) {
			for (int row = 0; row < 6; row++) {
				if (board[row][column] == 'R') {
					redCount += 1;
					if (redCount == 4) {
						System.out.println("Red Wins!");
						System.exit(1);
					}
				} else {
					redCount = 0;
				}
				if (board[row][column] == 'Y') {
					yelCount += 1;
					if (yelCount == 4) {
						System.out.println("Yellow Wins!");
						System.exit(1);
					}
				} else {
					yelCount = 0;
				}
			}
			redCount = 0;
			yelCount = 0;
		}
	}

	/************************************************/
	/* Name: checkDiagonalWinner (char[][] board) 	*/
	/************************************************/
	/* Purpose: To add the numbers in the matrixes  */
	/* Parameters: 									*/
	/*	char[][] board								*/
 	/* Return: N/A 									*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	column 		int 			0-7 			the number of columns
	row 		int 			0-4 			the number of rows
	*/
	public static void checkDiagonalWinner (char[][] board) {

		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 7; column++) {
				if (board[row][column] == 'R' || board[row][column] == 'Y') {
					if (row > 2 && column < 4) {
						if(
						(board[row][column] == 'R' && 
						board[row - 1][column + 1] == 'R' && 
						board[row - 2][column + 2] == 'R' && 
						board[row - 3][column + 3] == 'R') 
						){ 
						   	System.out.println("Red Wins!");
							System.exit(1);
						} else if (
						(board[row][column] == 'Y' && 
						board[row - 1][column + 1] == 'Y' && 
						board[row - 2][column + 2] == 'Y' && 
						board[row - 3][column + 3] == 'Y')
						){
							System.out.println("Yellow Wins!");
							System.exit(1);
						}
					}
					if(row < 3 && column < 4) {
						if(
						(board[row][column] == 'R' && 
						board[row + 1][column + 1] == 'R' && 
						board[row + 2][column + 2] == 'R' && 
						board[row + 3][column + 3] == 'R') 
						){
							System.out.println("Red Wins!");
							System.exit(1);
						} 
						if (
						(board[row][column] == 'Y' && 
						board[row + 1][column + 1] == 'Y' && 
						board[row + 2][column + 2] == 'Y' && 
						board[row + 3][column + 3] == 'Y')
						){
							System.out.println("Yellow Wins!");
							System.exit(1);
						}
					}
				}
			}
		}
	}
}







