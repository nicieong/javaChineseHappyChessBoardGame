package chinesehappychess;

import java.util.HashMap;

public class ChessBoardContent {
	
	private static final HashMap<Integer, String> boardContent = new HashMap<Integer, String>() {{
	
		put(1, "Start");
		put(2, "Get on a seesaw. From low side to high side. Jump to 19");
		put(3, "Nothing happended");
		put(4, "Nothing happended");
		put(5, "High jump to 15");
		put(6, "Nothing happended");
		put(7, "Climb up a slide to 28");
		put(8, "Nothing happended");
		put(9, "Nothing happended");
		put(10, "Nothing happended");
		put(11, "Climb up on a noodle climber to 31");
		put(12, "Nothing happened");
		put(13, "Nothing happened");
		put(14, "Nothing happened");
		put(15, "Nothing happened");
		put(16, "Nothing happened");
		put(17, "Get on a seesaw. From high side to low side. Back to 4");
		put(18, "Nothing happened");
		put(19, "Nothing happened");
		put(20, "Fall from monkey bar. Back to 1");
		put(21, "100m speed run. Go to 26");
		put(22, "Nothing happened");
		put(23, "Nothing happened");
		put(24, "Fall over. Pause for next round");   // pause 1 turn
		put(25, "Nothing happened");
		put(26, "Nothing happened. End of 100m speed run");
		put(27, "Nothing happened");
		put(28, "Nothing happened. Top of the slide");
		put(29, "Slide from the slide. Back to 10");
		put(30, "Nothing happened");
		put(31, "Nothing happened");
		put(32, "Nothing happened");
		put(33, "Javelin Throw to 37");
		put(34, "Nothing happened");
		put(35, "Nothing happened");
		put(36, "Nothing happened");
		put(37, "(Note: If player get here from Javelin Throw, no extra event being triggered.)\nPlay badminton. Hit the shuttlecock to 46");
		put(38, "Nothing happened");
		put(39, "Nothing happened");
		put(40, "Get on Ferris wheel. Go to 60");
		put(41, "Nothing happened");
		put(42, "Nothing happened");
		put(43, "Nothing happened");
		put(44, "Nothing happened");
		put(45, "Nothing happened");
		put(46, "Nothing happened");
		put(47, "Play badminton. Hit back the shuttlecock to 36");
		put(48, "Nothing happened");
		put(49, "Nothing happened");
		put(50, "Get on Merry-Go-Round. Turn to 51");
		put(51, "Nothing happened");
		put(52, "Nothing happened");
		put(53, "Get on Merry-Go-Round. Turn to 48");
		put(54, "Nothing happened");
		put(55, "Nothing happened");
		put(56, "Nothing happened");
		put(57, "Take a spin on Maypole Spinner. Swing to 63");
		put(58, "From top of Ferris wheel to the ground. Back to 38");
		put(59, "Nothing happened");
		put(60, "Nothing happened");
		put(61, "Play pole vault and jump to 79");
		put(62, "Throw your paper plane to 78");
		put(63, "Nothing happened");
		put(64, "Nothing happened");
		put(65, "Too focus on watching Maypole Spinner. Pause for next 2 rounds");   // pause 2 turns
		put(66, "Nothing happened");
		put(67, "Take a spin on Maypole Spinner. Swing back to 55");
		put(68, "Nothing happened");
		put(69, "Nothing happened");
		put(70, "Nothing happened");
		put(71, "Play shot put and throw the shot to 74");
		put(72, "Nothing happened");
		put(73, "Nothing happened");
		put(74, "Nothing happened");
		put(75, "Nothing happened");
		put(76, "Nothing happened");
		put(77, "Nothing happened");
		put(78, "Nothing happened");
		put(79, "Nothing happened");
		put(80, "Nothing happened");
		put(81, "Nothing happened");
		put(82, "Get drowned! Pause for next round");   // pause 1 turn
		put(83, "Nothing happened");
		put(84, "Nothing happened");
		put(85, "Nothing happened");
		put(86, "Nothing happened");
		put(87, "Nothing happened");
		put(88, "Nothing happened");
		put(89, "Play basketball. Shoot the ball to 91");
		put(90, "Play football. Pass the ball back to 87");
		put(91, "Nothing happened");
		put(92, "Nothing happened");
		put(93, "Ski down the slope and back to 75");
		put(94, "Nothing happened");
		put(95, "Discus throw out of bounds. Pause for next round");    // pause 1 turn
		put(96, "Playing Water Slide, ride back to 84");
		put(97, "Nothing happened");
		put(98, "Nothing happened");
		put(99, "Dive back to 83");
		put(100, "Finished! Congratulations!");
		
	}};

	public static HashMap<Integer, String> getBoardcontent() {
		return boardContent;
	}
	
	
}
