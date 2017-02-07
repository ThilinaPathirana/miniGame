import java.util.Arrays;

public class GameMain {
	
	public static long starttime;
	public static long endtime;

	private static int[][] MonsterandTreesLocations = Location.makeTreesandMonsterLocation();   // Monsters and Tree Locations
	private static int[][] MonsterLocations = new int[5][2];                                    // Monster Locations
	private static int[][] TreesLocations = new int[5][2];                                      // Tree Locations
	private static int[][] WarriorLocations = Location.setWarriorLocations();                   // Warrior Locations

	private static String[] Warriors = { "Jack", "Jizz", "Bumze", "Knch" };                  // Array list of Names of the Warriors
	private static String[] Trees = { "Tree 1", "Tree2", "Tree3", "Tree4","Tree5" };             // Array List of the names of the Trees
			
	private static String[] Monsters = { "Booji", "Gonzi", "Geeya", "Kikzu", "Zaja" };              // ArrayList of the names of the Monsters

	private static MagicTree[] TreeList = new MagicTree[5];                                     // Tree Objects
	private static Monster[] MonsterList = new Monster[5];                                      // Monster objects
	private static Warrior[] WarriorList = new Warrior[4];                                      // Warrior objects

	public static Grid g = new Grid();                                                          // initialise the grid to create
	public static Mount Mountdoom = new Mount();                                                // make the mount doom object

	public static void makeGridLocationsofMonsters() {                                          // initialise to make Monster Loctions
		for (int i = 0; i < 5; i++) {
			MonsterLocations[i] = MonsterandTreesLocations[i];
		}
	}

	public static void makeGridLocationsofTrees() {                                             // initialise to make Tree Loctions
		for (int i = 0; i < 5; i++) {
			TreesLocations[i] = MonsterandTreesLocations[i + 5];
		}
	}

	public static Monster[] getMonsterList() {
		return MonsterList;
	}

	public static MagicTree[] getTreeList() {
		return TreeList;
	}

	public static String[] getWarriorsnames() {
		return Warriors;
	}

	public static Warrior[] getWarriorList() {
		return WarriorList;
	}

	public static void main(String[] args) {
		makeGridLocationsofMonsters();
		makeGridLocationsofTrees();
		
		System.out.println("Initial Warrior Locations.........");
		for (int[] i : WarriorLocations) {
			System.out.print(" " + Arrays.toString(i));
		}
		System.out.println(" ");
		System.out.println("Tree Locations....................");
		for (int[] i : TreesLocations) {
			System.out.print(" " + Arrays.toString(i));
		}
		System.out.println(" ");
		System.out.println("Monster Locations.................");
		for (int[] i : MonsterLocations) {
			System.out.print(" " + Arrays.toString(i));
		}
		System.out.println(" ");
		System.out.println(" ");
		for (int i = 0; i < 2; i++) {
			WarriorList[i] = new SuperWarrior(Warriors[i], WarriorLocations[i]);           //polymorphism

		}

		for (int i = 2; i < 4; i++) {
			WarriorList[i] = new NormalWarrior(Warriors[i], WarriorLocations[i]);
		}

		for (int i = 0; i < 5; i++) {
			TreeList[i] = new MagicTree(Trees[i], TreesLocations[i]);
		}

		for (int i = 0; i < 3; i++) {
			MonsterList[i] = new InnocentMonster(Monsters[i],
					MonsterLocations[i]);
		}

		for (int i = 3; i < 5; i++) {
			MonsterList[i] = new ViolentMonster(Monsters[i],
					MonsterLocations[i]);
		}

		Thread t1 = new Thread(WarriorList[0]);                                              //initialise the thread objects
		Thread t2 = new Thread(WarriorList[1]);
		Thread t3 = new Thread(WarriorList[2]);
		Thread t4 = new Thread(WarriorList[3]);
		starttime=System.currentTimeMillis();
		t1.start();                                                                          // start the warrior object thread 
		t2.start();
		t3.start();
		t4.start();
	}

}
