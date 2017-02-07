import java.util.ArrayList;
import java.util.Random;

public class Location {
	static ArrayList<ArrayList<Integer>> Locations = new ArrayList<ArrayList<Integer>>();          // ArrayList for all locations for Monsters and Trees
	static int[][] WarriorLocations = new int[4][2];                                               // Warrior Locations                            
	static int[][] TreesandMonsterLocation = new int[10][2];                                       // Trees and Monster Locations
	
	public static int[][] makeTreesandMonsterLocation(){                                           // method for make Locations for Monsters and Trees
		for (int i=0; i<10; i++){
			int[] loc = setLocation();
			TreesandMonsterLocation[i] = loc;
		}
		return TreesandMonsterLocation;
	}

	public static int[] setLocation() {                                                            // Set the Locations for a unique object
		boolean occupied = true;
		ArrayList<Integer> newLocation = new ArrayList<Integer>(2);
		ArrayList<Integer> mountdome = new ArrayList<Integer>(2);
		mountdome.add(5);
		mountdome.add(5);
		while (occupied) {                                                                         // if the location is occupied by someone
			occupied = false;
			newLocation.clear();
			Random r = new Random();
			newLocation.add(r.nextInt(10));
			newLocation.add(r.nextInt(10));
			if (newLocation.equals(mountdome)) {
				occupied = true;
			}
			for (int i = 0; i < Locations.size(); i++) {
				if (Locations.get(i).equals(newLocation)) {
					occupied = true;
					break;
				}
			}
		}
		Locations.add(newLocation);
		int arry[] = new int[2];
		arry[0] = newLocation.get(0);
		arry[1] = newLocation.get(1);
		return arry;
	}

	public static int[][] setWarriorLocations() {                                                 // set the warrior Locations Randomly               
		Random randomwarr = new Random();
		for (int i= 0; i < 4; i++) {
			int[] subLocation = new int[2];
			int randomloc = randomwarr.nextInt(4);
			switch(randomloc){
			case 0 :
				subLocation[0]= randomwarr.nextInt(11);
				subLocation[1]= 0;
				break;
			
			case 1 :
				subLocation[0]= 0;
				subLocation[1]= randomwarr.nextInt(11);
				break;
				
			case 2 :
				subLocation[0]= 10;
				subLocation[1]= randomwarr.nextInt(11);
				break;
			case 3 :
				subLocation[0]= randomwarr.nextInt(11);
				subLocation[1]= 10;
				break;
			}
			WarriorLocations[i]= subLocation;
		}
		return WarriorLocations;
	}
}
