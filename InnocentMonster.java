
public class InnocentMonster extends Monster{

	public InnocentMonster(String name, int[] location) {                                         // Constructor for the InnocentMonster
		super(name, location);
		// TODO Auto-generated constructor stub
	}
	
	public void stealStick(Warrior w){                                                            // method for steal the Sticks of the Warrior
		System.out.println(w.getName()+ "  has caught by Innocent Monster "+ this.getName());
		WalkingStick ws = w.looseStick();
		StolenSticks.add(ws);                                                                     // stolen sticks were added to the Array List
	}
}
