import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class NormalWarrior extends Warrior { 													// using inheritance of worrier
	public NormalWarrior(String name, int[] location) { 										// constructor for normal worrier
		super(name, location);
	}
	
	public void walk() { 	
		try {
			GameMain.g.setGrid();
			Random randomNumber = new Random();
			int x = this.getLocation()[0];
			int y = this.getLocation()[1]; 
			System.out.println(this.getName()+"Started the battle of running "+"["+ x + "," + y+"]");		// x and y coordinates of the location
			while (mobility && !hassomeonewon) { 												// check whether mobility true and has someone won already
				synchronized(GameMain.g.getCell(x, y)){
				int direction = randomNumber.nextInt(2);
				int[] currentLoc = { x, y };
																			                    // make a small delay to run the steps clearly
					
					
				
				 
				 										                                        // at each step randomly select go straight or turn
				 
				
				if(GameMain.g.getGridpointObject(x, y,0) instanceof MagicTree){
					
					this.eatFruit();}
				if(GameMain.g.getGridpointObject(x, y,0) instanceof InnocentMonster){
					((InnocentMonster) GameMain.g.getGridpointObject(x, y,0)).stealStick(this);}
				if(GameMain.g.getGridpointObject(x, y,0) instanceof ViolentMonster){
					((ViolentMonster)GameMain.g.getGridpointObject(x, y,0)).kill(this);}
				
				
										                                                        // check whether worrier has arrived to the  mount doom
				if (GameMain.g.getGridpointObject(x, y,0) instanceof Mount){ 
					synchronized(GameMain.Mountdoom){	
					mobility = false; 															// if arrived he don`t need to walk anymore
					setSomeonewon(true); 													    // make the variable true
					Thread.sleep(800);
					
					System.out.println(getName() + " Climbed the mountain and won!!!"); 		// display that worrier climbed the mountain
					System.out.println("<<<<<Game Finished!!!>>>>>");
				}}
				
				
						
					
					 
				GameMain.g.clearGridpoint(x, y);
				if (x <= 5 && y <= 5) { 													    // if worrier is in left down side of the grid step by step his 
					if (direction == 0) {														// x coordinate increment and y coordinate increment
						x += 1;
					} else {
						y += 1;
					}
				} else if (x <= 5 & y >= 5) { 													// if worrier is in right down side of the grid step by step his
					if (direction == 0) {														// x coordinate increment and y coordinate decrement
						x += 1;
					} else {
						y -= 1;
					}
				} else if (x >= 5 && y >= 5) { 													// if worrier is in right up side of the grid step by step his
					if (direction == 0) {														// x coordinate decrement and y coordinate decrement
						x -= 1;
					} else {
						y -= 1;
					}
				} else if (x >= 5 && y <= 5) { 													// if worrier is in left up side of the grid step by step his 
					if (direction == 0) {														// x coordinate decrement and y coordinate increment
						x -= 1;
					} else {
						y += 1;
					}
				}
				if( GameMain.g.getGridpointObject(x, y,1) instanceof Warrior){
					x = currentLoc[0]; 											                // if that so this worrier remains previous x coordinate
					y = currentLoc[1];}
				
				int[] newlocation={x,y};
				this.setLocation(newlocation);
				GameMain.g.setGridpoint(x, y, this);
				if(!hassomeonewon && mobility){System.out.println(getName() + " walking to " +"["+ x + "," + y+"]");}
				Thread.sleep(700);
				}}
				
				
			
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
