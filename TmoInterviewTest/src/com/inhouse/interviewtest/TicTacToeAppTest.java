package com.inhouse.interviewtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TicTacToeAppTest {

	@Test
	@DisplayName("Check Game Over")
	void checkGameOver() {
		char [][] board = {{'_', '_', 'X'},
						   {'_', '_', 'X'},
						   {'_', '_', 'X'}
						   }; 

		boolean status = TicTacToeApp.isGameOver(board, 'X');
		assertTrue(status);
	}
}
