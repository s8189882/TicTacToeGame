package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	char gameBoard[] = null;
	char playerLetter = '\0';
	char computerLetter = '\0';

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game Program in Java!");
		System.out.println("In this program you will compete to win in a Tic Tac Toe game against the Computer.\n");
		
		TicTacToeGame gameObj = new TicTacToeGame();
		gameObj.initialiseGame();
		gameObj.choosePlayerLetter();
	}
	
	void initialiseGame(){
		gameBoard = new char[10];
		for(int index = 0; index < 10; index++)
			gameBoard[index] = ' ';
	}	
	
	void choosePlayerLetter() {
		System.out.println("\nPlayer please choose your play Letter.");
		System.out.println("Enter 'X' to play 'X' on your turn.");
		System.out.println("Or Enter 'O' to play 'O' on your turn.");
		Scanner sc = new Scanner(System.in);
		char playerInput = sc.next().charAt(0);
		sc.close();
		if (playerInput == 'X' || playerInput == 'x') {
			playerLetter = 'X';
			computerLetter = 'O';
		}
		else if (playerInput == 'O' || playerInput == 'o') {
			playerLetter = 'O';
			computerLetter = 'o';
		}
		else
			System.out.println("\nInvalid Input.\nPlease try again!");
	}
}
