package Othello;

public class Slot {
	int row;
	int col;
	String state;

	// boolean available; // clarify and agree on meaning of this
	// if(this.white || this.black){
	// this available=false;
	// }

	// not totally sure position belongs slot
	// perhaps its enough to do like call grid[1][4].slot.flipp()
	// and grid[1][3].slot.available=false;

	// Position pos = new Position();

	public Slot(int x, int y, String state) {
		this.row = x;
		this.col = y;
		this.state = state;
	}

	public void flip() {
		if (this.state == "white")
			this.state = "black";
		else if (this.state == "black")
			this.state = "white";
		else
			System.out.println("Error in slot flip function.");
		;
	};
	
	public int getRow(Slot slot) {
		return slot.row;
	}
	
	public int getCol(Slot slot) {
		return slot.col;
	}

};
