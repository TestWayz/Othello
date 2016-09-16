package Othello;

public class Start {
	public static Slot grid[][] = new Slot[4][4];
	public static int utility[] = new int[2]; // Score keeper White,Black
	public boolean actions[][] = new boolean[4][4];
	public static final String White = "White";
	public static final String Black = "Black";
	public static String player = "White";

	public static void main(String[] args) {
		// main game loop
		initializeGrid();//set each Slot of the grid to "available"
		for (int n = 0; n < 8; n++) {
			// getPlayerMove();
			// updateGrid();
			// displayGrid();

			// calculateMove();
			// updateGrid();
			displayGrid();

			String input = System.console().readLine();
		}
	}

	// toggle player NOT SURE IF THIS IS NEEDED
	/*
	 * public static void nextPlayer(){ //Toggle player if
	 * (player.equals(White)){ player=Black; }else if(player.equals(Black)){
	 * player=White; } };
	 */

	public static void displayGrid() {
		for (int row = 0; row < 4; row++) {
			String rowString = "|";
			for (int col = 0; col < 4; col++) {
				if (grid[row][col].available) {
					rowString = rowString + "   |";
				} else if (grid[row][col].white) {
					rowString = rowString + " W |";
				} else {
					rowString = rowString + " B |";
				}
			}
			System.out.println(rowString);
		}
	}

	// Calculate both players current score
	public static int[] utility() {
		int noOfBlack = 0;
		int noOfWhite = 0;
		int[] score = new int[2]; // Score keeper White,Black

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				if (grid[row][col].black) {
					noOfBlack++;
				} else if (grid[row][col].white) {
					noOfWhite++;
				}
			}
		}
		score[0] = noOfWhite;
		score[1] = noOfBlack;
		return score;
	}

	public static void initializeGrid() {
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				grid[row][col].available = true;
			}
		}
	}
}
