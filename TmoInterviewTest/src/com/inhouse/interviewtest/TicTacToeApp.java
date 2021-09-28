package com.inhouse.interviewtest;

import java.util.Scanner;

public class TicTacToeApp {
	private static char[][] board = new char[3][3];
	private static final char player1 = 'X';
	private static final char player2 = 'O';

	public static void main(String[] args) {	
		init(board);
	
		System.out.println("tic-tac-toe");
		System.out.println("Welcome! Here is your board: \n");
		display(board);

		boolean gameOver = false;		
		try (Scanner sc = new Scanner(System.in)) {
		while(!gameOver) {
			String msg = "where would you like to move?";
			gameOver = isGameOver(board, player2);
			if(gameOver)
				System.out.println("Player2 (O) won!");
			else {			
				System.out.println("Player1 (X) " + msg);
				play(board, player1, sc);
			}
			
			gameOver = isGameOver(board, player1);
			if(gameOver)
				System.out.println("Player1 (X) won!");
			else {
				System.out.println("Player2 (O) " + msg);
				play(board, player2, sc);
			}				
		}
	}
}

	public static boolean isGameOver(char[][] board ,char player) {
		int d1 = 0, d2 = 0;
		for(int i = 0; i < 3; i++) {
			int r = 0;
			int c = 0;
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == player)
					r++;
				if(board[j][i] == player) // transpose
					c++;
				
				if(i == j && board[i][j] == player)
					d1++;
				
				if((i == 2 - j) && board[i][j] == player)
					d2++;
			}			
			if(r == 3 || c == 3)
				return true;
		}
		
		if(d1 == 3 || d2 == 3)
			return true;
		
		return false;
	}
			
			
	public static void play(char[][] board, char player, Scanner sc) {	
		String move = sc.nextLine();
		int row = Integer.parseInt(move.substring(0,1));
		int col = Integer.parseInt(move.substring(2,3));
				
		board[row -1][col-1] = player;
		display(board);
	}

	public static void display(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 2)
					System.out.print(board[i][j]);
				else
					System.out.print(board[i][j] + ",");
			}
			System.out.println();
		}		
	}
		
	public static void init(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		System.out.println();
	}
}
