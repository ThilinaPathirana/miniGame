
public class MagicTree {
	private String name;
	private int[] location = new int[2];
	
	
	public MagicTree(String name, int[] location){                            // Constructor for the Magic Tree
		this.name=name;
		this.location=location;
	}
	
	public int[] getLocation(){                                               // get the Location of the Magic Tree
		return location;
	}
	
	public void setLocation(int[] location){                                  // set the Location of the Magic Tree
		this.location=location;
	}
	
	

}
