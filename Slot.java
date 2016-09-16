package Othello;

public class Slot {
	boolean white;
	boolean black;
	
	boolean available; //clarify and agree on meaning of this
	//if(this.white || this.black){
	//	this available=false;
	//}
	
	//not totally sure position belongs slot
	//perhaps its enough to do like call grid[1][4].slot.flipp() 
	//and  grid[1][3].slot.available=false;
	
	Position pos = new Position();
	
	public void flip(){
		if(this.white || this.black){
			this.white =! this.white;
			this.black =! this.black;
		}else{
			System.out.println("Error in slot flip function.");
		};
	};			
};

