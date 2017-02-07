
public class ViolentMonster extends Monster {

	public ViolentMonster(String name, int[] location) {                                                  // Constructor for the Monster
		super(name, location);
		// TODO Auto-generated constructor stub
	}
	
	public void kill(Warrior w){                                                                          // method for killing the warrior
		if(!w.getImmortality()){
			System.out.println(w.getName()+" caught by Violent Monster "+ this.getName()+" and died..");
			w.die();
			System.out.println("The remaining no. of Warriors are  " + Warrior.getNoofWarriors());
			w=null;
		}
	}
	
	public void stealStick(Warrior w){                                                                    // method for steal the WalkingSticks
		System.out.println(w.getName()+ "  has caught by Innocent Monster "+ this.getName());
		WalkingStick ws = w.looseStick();
		StolenSticks.add(ws);
	}
}
