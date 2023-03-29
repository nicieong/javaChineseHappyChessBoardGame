package chinesehappychess;

import java.util.HashMap;
import java.util.regex.*;

public class Player {
	
	private int player1position = 1;
	private int player2position = 1;
	private int player3position = 1;
	private int player4position = 1;
	
	// no-arg constructor to create players objects
	public Player() {};

	
	public int getPlayer1position() {
		return player1position;
	}

	public void setPlayer1position(int player1position) {
		this.player1position = player1position;
	}

	public int getPlayer2position() {
		return player2position;
	}

	public void setPlayer2position(int player2position) {
		this.player2position = player2position;
	}

	public int getPlayer3position() {
		return player3position;
	}

	public void setPlayer3position(int player3position) {
		this.player3position = player3position;
	}

	public int getPlayer4position() {
		return player4position;
	}

	public void setPlayer4position(int player4position) {
		this.player4position = player4position;
	}


	protected boolean player1TurnStatus = true;
	protected boolean player2TurnStatus = true;
	protected boolean player3TurnStatus = true;
	protected boolean player4TurnStatus = true;
	
	protected int player1CountPause = 0;
	protected int player2CountPause = 0;
	protected int player3CountPause = 0;
	protected int player4CountPause = 0;
	
	// Game flow:
	GameSetUp setup = new GameSetUp();
	protected String status;
	protected int current;
	protected int diceNum;
	protected int moveTo;
	protected int extra;
	protected int newCurrent;
	
	protected boolean gameStatus = true;
	
	public boolean isGameStatus() {
		return gameStatus;
	}


	public void handlePOneTurn() {
		//Press Enter to go
		setup.takeTurn();
		
		// get current position
		current = getPlayer1position();
		System.out.println("Current location: " + current);
		
		status = ChessBoardContent.getBoardcontent().get(current);
		System.out.println("Status on current location: "+status);
		
		if (player1CountPause == 0) {
			player1TurnStatus = true;
		} else if (player1CountPause != 0) {
			System.out.println("Your turn is paused from previous record");
			player1CountPause--;
			player1TurnStatus = false;
		} 
		
		if (player1TurnStatus == true) {
		
			// roll the dice
			System.out.println("Roll the dice -->");
			diceNum = GameSetUp.diceResult();
			System.out.println("Steps to go: " + diceNum);
			
			// return latest position after adding the dice result
			moveTo = current + diceNum;
			
			if (moveTo > GameSetUp.getFinishpoint()) {
				moveTo = GameSetUp.getFinishpoint()-(moveTo - GameSetUp.getFinishpoint());
			}
			
			System.out.println("Location after rolling the dice: " + (moveTo));
			
			// return status of the latest position
			status = ChessBoardContent.getBoardcontent().get(moveTo);
			System.out.println("Status on new location: "+status);
			setPlayer1position(moveTo);
					
			if (moveTo == 100) {
				gameStatus = false;
			} else {
				gameStatus = true;
			
				// determine further actions on moving forward or backward at the latest position
				if (status.equalsIgnoreCase("Nothing happened") == false) {
					String action = status.substring(status.length()-2,status.length());
					if (action.matches("[a-z][a-z]") == false) {		
						extra = Integer.parseInt(action.replaceAll(" ","0"));
						moveTo = extra;
					} else {
						extra = 0;
					}
					setPlayer1position(moveTo);
				}
				
				// set status if hit Pause actions
				if (status.contains("Pause") == true) {
					if (moveTo == 65) {
						player2CountPause = 2;
					} else {
						player2CountPause = 1;
					}
				}
			}
			
			
			newCurrent = getPlayer1position();
			System.out.println("Location after extra action: " + newCurrent);
		}
	}
	
	public void handlePTwoTurn() {
		//Press Enter to go
		setup.takeTurn();
		
		// get current position
		current = getPlayer2position();
		System.out.println("Current location: " + current);
		
		status = ChessBoardContent.getBoardcontent().get(current);
		System.out.println("Status on current location: "+status);
		
		if (player2CountPause == 0) {
			player2TurnStatus = true;
		} else if (player2CountPause != 0) {
			System.out.println("Your turn is paused from previous record");
			player2CountPause--;
			player2TurnStatus = false;
		} 
		
		if (player2TurnStatus == true) {
		
			// roll the dice
			System.out.println("Roll the dice -->");
			diceNum = GameSetUp.diceResult();
			System.out.println("Steps to go: " + diceNum);
			
			// return latest position after adding the dice result
			moveTo = current + diceNum;
			
			if (moveTo > GameSetUp.getFinishpoint()) {
				moveTo = GameSetUp.getFinishpoint()-(moveTo - GameSetUp.getFinishpoint());
			}
			
			System.out.println("Location after rolling the dice: " + (moveTo));
			
			// return status of the latest position
			status = ChessBoardContent.getBoardcontent().get(moveTo);
			System.out.println("Status on new location: "+status);
			setPlayer2position(moveTo);
			
			if (moveTo == 100) {
				gameStatus = false;
				System.out.println("Game is finished!");
			} else {
				gameStatus = true;
			
				// determine further actions on moving forward or backward at the latest position
				if (status.equalsIgnoreCase("Nothing happened") == false) {
					String action = status.substring(status.length()-2,status.length());
					if (action.matches("[a-z][a-z]") == false) {		
						extra = Integer.parseInt(action.replaceAll(" ","0"));
						moveTo = extra;
					} else {
						extra = 0;
					}
					setPlayer2position(moveTo);
				}
				
				// set status if hit Pause actions
				if (status.contains("Pause") == true) {
					if (moveTo == 65) {
						player2CountPause = 2;
					} else {
						player2CountPause = 1;
					}
				}
			}
			
			newCurrent = getPlayer2position();
			System.out.println("Location after extra action: " + newCurrent);
		}
	}
	
	public void handlePThreeTurn() {
		//Press Enter to go
		setup.takeTurn();
		
		// get current position
		current = getPlayer3position();
		System.out.println("Current location: " + current);
		
		status = ChessBoardContent.getBoardcontent().get(current);
		System.out.println("Status on current location: "+status);
		
		if (player3CountPause == 0) {
			player3TurnStatus = true;
		} else if (player3CountPause != 0) {
			System.out.println("Your turn is paused from previous record");
			player3CountPause--;
			player3TurnStatus = false;
		} 
		
		if (player3TurnStatus == true) {
		
			// roll the dice
			System.out.println("Roll the dice -->");
			diceNum = GameSetUp.diceResult();
			System.out.println("Steps to go: " + diceNum);
			
			// return latest position after adding the dice result
			moveTo = current + diceNum;
			
			if (moveTo > GameSetUp.getFinishpoint()) {
				moveTo = GameSetUp.getFinishpoint()-(moveTo - GameSetUp.getFinishpoint());
			}
			
			System.out.println("Location after rolling the dice: " + (moveTo));
			
			// return status of the latest position
			status = ChessBoardContent.getBoardcontent().get(moveTo);
			System.out.println("Status on new location: "+status);
			setPlayer3position(moveTo);
			
			if (moveTo == 100) {
				gameStatus = false;
				System.out.println("Game is finished!");
			} else {
				gameStatus = true;
			
				// determine further actions on moving forward or backward at the latest position
				if (status.equalsIgnoreCase("Nothing happened") == false) {
					String action = status.substring(status.length()-2,status.length());
					if (action.matches("[a-z][a-z]") == false) {		
						extra = Integer.parseInt(action.replaceAll(" ","0"));
						moveTo = extra;
					} else {
						extra = 0;
					}
					setPlayer3position(moveTo);
				}
				
				// set status if hit Pause actions
				if (status.contains("Pause") == true) {
					if (moveTo == 65) {
						player3CountPause = 2;
					} else {
						player3CountPause = 1;
					}
				}
			}
			
			newCurrent = getPlayer3position();
			System.out.println("Location after extra action: " + newCurrent);
		}
	}
	
	public void handlePFourTurn() {
		//Press Enter to go
		setup.takeTurn();
		
		// get current position
		current = getPlayer4position();
		System.out.println("Current location: " + current);
		
		status = ChessBoardContent.getBoardcontent().get(current);
		System.out.println("Status on current location: "+status);
		
		if (player4CountPause == 0) {
			player4TurnStatus = true;
		} else if (player3CountPause != 0) {
			System.out.println("Your turn is paused from previous record");
			player4CountPause--;
			player4TurnStatus = false;
		} 
		
		if (player4TurnStatus == true) {
		
			// roll the dice
			System.out.println("Roll the dice -->");
			diceNum = GameSetUp.diceResult();
			System.out.println("Steps to go: " + diceNum);
			
			// return latest position after adding the dice result
			moveTo = current + diceNum;
			
			if (moveTo > GameSetUp.getFinishpoint()) {
				moveTo = GameSetUp.getFinishpoint()-(moveTo - GameSetUp.getFinishpoint());
			}
			
			System.out.println("Location after rolling the dice: " + (moveTo));
			
			// return status of the latest position
			status = ChessBoardContent.getBoardcontent().get(moveTo);
			System.out.println("Status on new location: "+status);
			setPlayer4position(moveTo);
			
			if (moveTo == 100) {
				gameStatus = false;
				System.out.println("Game is finished!");
			} else {
				gameStatus = true;
			
				// determine further actions on moving forward or backward at the latest position
				if (status.equalsIgnoreCase("Nothing happened") == false) {
					String action = status.substring(status.length()-2,status.length());
					if (action.matches("[a-z][a-z]") == false) {		
						extra = Integer.parseInt(action.replaceAll(" ","0"));
						moveTo = extra;
					} else {
						extra = 0;
					}
					setPlayer4position(moveTo);
				}
				
				// set status if hit Pause actions
				if (status.contains("Pause") == true) {
					if (moveTo == 65) {
						player4CountPause = 2;
					} else {
						player4CountPause = 1;
					}
				}
			}
			
			newCurrent = getPlayer4position();
			System.out.println("Location after extra action: " + newCurrent);
		}
	}
}
