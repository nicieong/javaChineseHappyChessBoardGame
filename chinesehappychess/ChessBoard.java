package chinesehappychess;

import java.util.ArrayList;
import java.util.HashMap;

public class ChessBoard {

	public static void main(String[] args) {

		GameSetUp setup = new GameSetUp();
		
		System.out.println("How many players would join (2 to 4) ?");
		setup.checkPlayerNum();
		
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		
		ArrayList <Object> player = new ArrayList<>();
		player.ensureCapacity(2);
		player.add(player1);
		player.add(player2);
		
		if (setup.getPlayerNum() == 3) {
			player.add(player3);
		} else if (setup.getPlayerNum() == 4) {
			player.add(player3);
			player.add(player4);
		}

		System.out.println("Current game has: "+player.size()+" players");
		
		HashMap<Object, String> playerName = new HashMap<Object, String>() {{
			put(player1, "Player 1");
			put(player2, "Player 2");
			put(player3, "Player 3");
			put(player4, "Player 4");
		}};
		
		
		// initialize the game with player1
		Player currentPlayer = player1;
		
		boolean gameStatus;
			
		do {
			System.out.println("It's "+playerName.get(currentPlayer)+"'s turn.");
						
			if (currentPlayer == player1) {
				player1.handlePOneTurn();
			} else if (currentPlayer == player2) {
				player2.handlePTwoTurn();
			} else if (player.size() == 3) {
				if (currentPlayer == player3) {
					player3.handlePThreeTurn();
				}
			} else if (player.size() == 4) {
				if (currentPlayer == player3) {
					player3.handlePThreeTurn();
				} else if (currentPlayer == player4) {
					player4.handlePFourTurn();
				}
			}
			
			System.out.println("End of the current turn");
			System.out.println("*****************************************");
			
			gameStatus = currentPlayer.gameStatus;
			
			if (gameStatus == true) {
				if (currentPlayer == player1) {
					currentPlayer = player2;
				} else if (currentPlayer == player2) {
					if (player.size() == 2) {
						currentPlayer = player1;
					} else if (player.size() >= 3) {
						currentPlayer = player3;
					}
				} else if (currentPlayer == player3) {
					if (player.size() == 3) {
						currentPlayer = player1;
					} else if (player.size() == 4) {
						currentPlayer = player4;
					}
				} else if (currentPlayer == player4) {
					currentPlayer = player1;
				}
			} else {
				System.out.println("Game is finished!");
			}
			
		} while (gameStatus == true);
		

	}	
}
