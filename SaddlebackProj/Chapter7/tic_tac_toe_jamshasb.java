import java.util.Scanner;

public class tic_tac_toe_jamshasb {

	public static void main(String[] args) {

		char[][] board = {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};
		
		for(int i = 0; i < 5; i++) {
			display(board);
			
			getChoice(board, 'X');			
			
			display(board);
			
			getChoice(board, 'O');
		}
		
	}

	public static void display(char[][] board) {
		
		System.out.println("");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

	public static void getChoice(char[][] board, char player) {
		Scanner scan = new Scanner(System.in);
		int place;
		
		//Get the user input that is between 1-9
		do {
			System.out.print("Enter where you would like to place your mark: ");
			place = scan.nextInt();
			if (place < 1 || place > 9) {
				System.out.println("**ERROR** Invalid place");
			} else {
				break;
			}
		} while (true);
		
		//Change the value of the board array
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
}