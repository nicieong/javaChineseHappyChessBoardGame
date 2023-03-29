package chinesehappychess;

import java.lang.Math;
import java.util.Scanner;

public class GameSetUp {

	private static final int finishPoint = 100;
	private static final int diceFace = 6;
	private int playerNum;
		
	Scanner keyboard = new Scanner(System.in);
	
	// get the dice number to calculate dice result
	public static int getDiceface() {
		return diceFace;
	}
	
	public int getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}

	public static int getFinishpoint() {
		return finishPoint;
	}

	
	// receive signal to start player's turn
	public void takeTurn() {
		System.out.println("Start your turn ---> (Press Enter)");
		String enter = keyboard.nextLine();
	}
	
	
	// calculate dice result
	public static int diceResult() {
		int diceResult = (int) (Math.floor(Math.random()* getDiceface()) + 1); 
		return diceResult;
	}
	
	
	
	// validate user input is in integer format or not
	// and return an integer value to further check if the input is within range
	public int checkInput() {
		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;
		
		while(isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if (hasNextInt) {
				value = keyboard.nextInt();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.println("Invalid input. Enter an integer number: ");
			}
			keyboard.nextLine();  // clean up the input stream
		}
		return value;
	}
	
	
	
	// validate number of players
	public int checkPlayerNum() {
		boolean outOfRange = true;
		int value = 0;
		
		while (outOfRange) {
			value = checkInput();
			if ( value >= 2 && value <= 4) {
				setPlayerNum(value);
				outOfRange = false; // break out of loop
			} else {
				outOfRange = true;
				System.out.println("Number of players can only be 2 to 4 players");
			}
		}
		return value;
	}

	
	public void checkPauseRound() {
		
	}
	
}

