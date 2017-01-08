/*****************************************************************************************************
  Chapter No. 3 - Exercise No. Tic_Tac_Toe
  File Name     : Tic_Tac_Toe.java
  Programmer    : .datOneGroup
  Due Date      : Mon. August 1, 2016

  Problem Statement: 
  The program will let a user play tic tac toe with a computer

  Overall Plan: 
  1. Create an initial 2d array of values 1-9 to simulate a tic toe board
  2. Generate a random number to determine who goes first. If player goes first the get to choose X or O
  3. Display the initial board
  4. Get the user's input for a mark 1-9 
  5. Validate their choice and check if the array element is empty before updating it with their character
  6. Display the updated board
  7. Check for a winner
  8. Genereate a random number for the computer to choose 
  9. Validate its choice and check if the array element is empty before updating
  10. Display the updated board
  11. Check for winner 
  12. At a certain iteration, check for a tie and call cat's game

  Classes needed and Purpose (Input, Processing, Output)
  main class -   Program_8_1_Nhek
   
  DATA DICTIONARY (ALPHABETICAL)
  ---------------
  ***********
  *CONSTANTS*
  ***********
  NAME   TYPE      VALUE RANGE  DESCRIPTION
  ====== =======   ===========  ============================================
  NONE
   
	***********
	*VARIABLES*
	***********
	NAME   TYPE     VALUE RANGE   DESCRIPTION
	====== ======== ============= ============================================
	board  char[][] X - O         2d array for tic tac toe. Either numbers, X
	                              or O
	first  int      0 - 1         number to let the player go first
	input  Scanner  NA            used for input
	pc     char     X or O        CPU's default character symbol
	player char     X or O        player's character symbol
	won    boolean  true or false determines if the game has been won
************************************************************************************************/
import java.util.Scanner;

public class Tic_Tac_Toe {

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] board = {{'1','2','3'},
						  {'4','5','6'},
						  {'7','8','9'}};
		
		char player = 'X';
		char pc 	= 'O';
		boolean won;
		int first;

		System.out.println("TIC TAC TOE\n");
		display(board);
		System.out.println();
		
		first = (int)(Math.random() * 2);
		
		// Let's the player go first and choose their symbol
		if (first == 1) {
			System.out.println("Player goes first!");
			do {
				System.out.print("Do you want to be 'X' or 'O'?: ");
				player = input.next().charAt(0);
				player = Character.toUpperCase(player);

				if(player != 'X' && player != 'O') {
					System.out.println("Wrong entry. Enter an 'X' or an 'O'");
				}

			} while(player != 'X' && player != 'O');

			// Game loops 5 times until someone wins or there is a tie
			for(int i = 0; i < 5; i++) {
				// Player actions
				getUserChoice(board, player);
				display(board);
				System.out.println();
				won = checkWinner(board, player);

				if(won) { 
					System.out.println("PLAYER WINS");
					System.out.println("GAME OVER");
					break;
				}
				else if((i == 4) && (!won)){
					System.out.println("Cat's game.");
					System.out.println("GAME OVER");
					break;
				}

				// CPU actions
				getCpuChoice(board, pc);
				display(board);
				System.out.println();
				won = checkWinner(board,pc);

				if(won) {	
					System.out.println("CPU WINS");
					System.out.println("GAME OVER");
					break;
				}
			}
		}
		else { 
			System.out.println("Computer goes first!");
			for(int i = 0; i < 5; i++) {
				// CPU actions
				getCpuChoice(board, pc);
				display(board);
				System.out.println();
				won = checkWinner(board, pc);

				if(won) {	
					System.out.println("CPU WINS");
					System.out.println("GAME OVER");
					break;
				}
				else if((i == 4) && (!won)){
					System.out.println("Cat's game.");
					System.out.println("GAME OVER");
					break;
				}

				// Player actions
				getUserChoice(board, player);
				display(board);
				System.out.println();
				won = checkWinner(board,player);

				if(won) {	
					System.out.println("PLAYER WINS");
					System.out.println("GAME OVER");
					break;
				}
			}
		}
	}

  /********************************************************************************************
    METHOD : randomNum
    PURPOSE: Generates a random number 1-9
    RETURN : int random

    DATA DICTIONARY
		***********
		*VARIABLES*
		***********
		NAME   TYPE     VALUE RANGE DESCRIPTION
		====== ======== =========== ==============================================
		board  char[][] X - O       2d array for tic tac toe. Either numbers, X or
		                            O
		random int      1-9         random number generated
   ********************************************************************************************/ 	
	public static int randomNum() {
	  int random = 1 + (int)(Math.random() * (9));
		return random;
	}

  /********************************************************************************************
    METHOD : display(char[][] board)
    PURPOSE: Displays the tic tac toe board
    RETURN : void - nothing

    DATA DICTIONARY
		***********
		*VARIABLES*
		***********
		NAME   TYPE     VALUE RANGE DESCRIPTION
		====== ======== =========== ==============================================
		board  char[][] X - O       2d array for tic tac toe. Either numbers, X or
		                            O
   ********************************************************************************************/ 	
	public static void display(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (j == 2) {
					System.out.print(board[i][j] + "  ");
				}
				else {
					System.out.print(board[i][j] + " | ");
				}
			}
			
			System.out.print("\n");
			if (i != 2){
				System.out.println("----------");
			}
		}	
	}

  /********************************************************************************************
    METHOD : getUserChoice(char[][] board, char player) 
    PURPOSE: Gets the user's choice for tic tac toe
    RETURN : void - nothing

    DATA DICTIONARY
		***********
		*VARIABLES*
		***********
		NAME   TYPE     VALUE RANGE DESCRIPTION
		====== ======== =========== ==============================================
		board  char[][] X - O       2d array for tic tac toe. Either numbers, X or
		                            O
		place  int      1 - 9       mark on the board to place character
		player char     X or O      player's character symbol
		scan   Scanner  NA          used for input
   ********************************************************************************************/ 
	public static void getUserChoice(char[][] board, char player) {	
		Scanner scan = new Scanner(System.in);	
		int place;
		
		//Get the user input that is between 1-9
		do {
			System.out.print("Enter where you would like to place your mark: ");
			place = scan.nextInt();

			if (place < 1 || place > 9) {
				System.out.println("**ERROR** Invalid place. Choose a number 1-9");
			} 
		} while(place < 1 || place > 9);
		
		//Change the value of the board array if it is valid
		if(validateChoice(board, player, place)) {
			switch (place) {
				case 1:
					board[0][0] = player;
					break;
				case 2:
					board[0][1] = player;
					break;
				case 3:
					board[0][2] = player;
					break;
				case 4:
					board[1][0] = player;
					break;
				case 5:
					board[1][1] = player;
					break;
				case 6:
					board[1][2] = player;
					break;
				case 7:
					board[2][0] = player;
					break;
				case 8:
					board[2][1] = player;
					break;
				case 9:
					board[2][2] = player;
					break;			
			}		
		}
		else {
			getUserChoice(board, player);
		}
	}

  /********************************************************************************************
    METHOD : getCpuChoice(char[][] board, char player)
    PURPOSE: Gets the cpu's choice for tic tac toe
    RETURN : void - nothing

    DATA DICTIONARY
		***********
		*VARIABLES*
		***********
		NAME   TYPE     VALUE RANGE DESCRIPTION
		====== ======== =========== ==============================================
		board  char[][] X - O       2d array for tic tac toe. Either numbers, X or
		                            O
		place  int      1 - 9       mark on the board to place character
		player char     X or O      player's character symbol
   ********************************************************************************************/ 
	public static void getCpuChoice(char[][] board, char player) {	
		int place = randomNum();
		
		//Change the value of the board array
		if(validateChoice(board, player, place)) {
			switch (place) {
				case 1:
					board[0][0] = player;
					break;
				case 2:
					board[0][1] = player;
					break;
				case 3:
					board[0][2] = player;
					break;
				case 4:
					board[1][0] = player;
					break;
				case 5:
					board[1][1] = player;
					break;
				case 6:
					board[1][2] = player;
					break;
				case 7:
					board[2][0] = player;
					break;
				case 8:
					board[2][1] = player;
					break;
				case 9:
					board[2][2] = player;
					break;			
			}
			System.out.println("Computer places its mark at " + place);		
		}
		else {
			getCpuChoice(board, player);
		}
	}

  /********************************************************************************************
    METHOD : validateChoice(char[][] board, char player, int place)
    PURPOSE: Verifies if the integer entered is a valid input to change the array index
    RETURN : boolean - verify

    DATA DICTIONARY
		***********
		*VARIABLES*
		***********
		NAME   TYPE     VALUE RANGE 	DESCRIPTION
		====== ======== =========== 	==============================================
		board  char[][] X - O       	2d array for tic tac toe. Either numbers, X or
		                            	O
		i      int      any int     	used for the row index of the 2d array
		j      int      any int     	used for the column index of the 2d array
		place  int      1 - 9       	mark on the board to place character
		player char     X or O      	player's character symbol
		verify boolean  true or false bool to determine if the choice made is valid or not
   ********************************************************************************************/ 		
	public static boolean validateChoice(char[][] board, char player, int place) {
		int i = 0;
		int j = 0;
		boolean verify = false;
		
		// Checks the input at the corresponding element if there is something already there
		switch (place){
			case 1: i = 0;
					j = 0;
					break;
			case 2: i = 0;
					j = 1;
					break;
			case 3: i = 0;
					j = 2;
					break;
			case 4: i = 1;
					j = 0;
					break;
			case 5: i = 1;
					j = 1;
					break;
			case 6: i = 1;
					j = 2;
					break;
			case 7: i = 2;
					j = 0;
					break;	
			case 8: i = 2;
					j = 1;
					break;
			case 9: i = 2;
					j = 2;
					break;			
			default: System.out.println("Something bad happened.");
		}
		if('O' == board[i][j] || 'X' == board[i][j]) {
		}
		else {
			verify = true;	
		}	
		return verify;
	}

  /********************************************************************************************
    METHOD : checkWinner(char[][] board, char player)
    PURPOSE: Verifies if the game has been won by checking all winning positions
    RETURN : boolean - win

    DATA DICTIONARY
		***********
		*VARIABLES*
		***********
		NAME   TYPE     VALUE RANGE 	DESCRIPTION
		====== ======== =========== 	==============================================
		board  char[][] X - O       	2d array for tic tac toe. Either numbers, X or O
		player char     X or O      	player's character symbol
		verify win      true or false bool to determine if the game has been won
   ********************************************************************************************/ 
	 public static boolean checkWinner(char[][] board, char player) {
		boolean win = false;

    // Horizontal check - row 0, row 1, row 2
		if((board[0][0] == player) && (board[0][1] == player) && (board[0][2] == player)) {
			win = true;
		}
		else if((board[1][0] == player) && (board[1][1] == player) && (board[1][2] == player)) {
			win = true;
		}
		else if((board[2][0] == player) && (board[2][1] == player && board[2][2] == player)) {
			win = true;
		}
		// Vertical check - col 0, col 1, col 2
		else if((board[0][0] == player) && (board[1][0] == player) && (board[2][0] == player)) {
			win = true;
		}
		else if((board[0][1] == player) && (board[1][1] == player) && (board[2][1] == player)) {
			win = true;
		}
		else if((board[0][2] == player) && (board[1][2] == player) && (board[2][2] == player)) {
			win = true;
		}
		// Diagonal check. NE then SE direction
		else if((board[0][0] == player) && (board[1][1] == player) && (board[2][2] == player)) {
			win = true;
		}
		else if((board[2][0] == player) && (board[1][1] == player) && (board[0][2] == player)) {
			win = true;
		}
		else {
			win = false;	  
		}
		return win;
	}
}