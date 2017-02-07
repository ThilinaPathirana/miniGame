
public abstract class Warrior extends Inhabitant implements Runnable{              // abstract Class Warrior extends the super class Inhabitant and implements the Runnable interface
	                                                                               // abstract is used because walk method is implemented by child clsses in different ways
	WalkingStick ws;
	public boolean Immortality= false;
	private static int noofWarriors;
	protected static boolean hassomeonewon;
	
	public Warrior(String name, int[] location){                                   // Constructor for the Warrior
		super(name,location);
		noofWarriors++;
		GameMain.Mountdoom.attach(this);
	}
	
	public void run(){                                                             //run method which runs when the Thread initialized 
		walk();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public WalkingStick looseStick(){
		mobility= false;
		WalkingStick temp= ws;
		ws= null;
		return temp;
	}
	public static int getNoofWarriors(){                                          // getter for the no of Warriors
		return noofWarriors;
	}
	
	public void die(){                                                            // method die
		noofWarriors--;
		mobility= false;
	}
	
	public void setImmortality(boolean set){                                      // setter for the Immortality
		Immortality=set;
	}
	
	public boolean getImmortality(){                                              // getter for the immortality
		return Immortality;
	}
	      
	public synchronized void eatFruit(){                                          // synchronized block is used only one thread can access this at a occasion
		if(!this.getImmortality()){
			System.out.println(this.getName()+" found Magic tree and became immortanal");
			this.setImmortality(true);
		}
	}
	
	public void setSomeonewon(boolean val){                                        // setter for checking that some one has won or not
		hassomeonewon= val;
	}
	
	public boolean getSomeonewon(){
		return hassomeonewon;
	}
	
	public void setMobility(boolean val){                                           // setter for the mobility
		mobility = val;
	}
	
	public abstract void walk();                                                    // abstract method walk implements in different way in child classes

	

}
