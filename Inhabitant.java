
public class Inhabitant {
	private String name;
	private int[] location= new int[2];                         // ArrayList for the Location in the  grid
	protected boolean mobility;
	
	public Inhabitant(String name,int[] location){              // Constructor for the Super class Inhabitant
		this.name= name;
		this.location= location;
		mobility= true;
	}
	
	
	public void setname(String name){                            // Setter for the name
		this.name=name;
	}
	
	public void setLocation(int [] location){                    // setter for the Location
		this.location=location;
	}
	
	public int[] getLocation(){                                  // getter for the Location
		return location;
	}
	
	public String getName(){                                    // getter for the name
		return name;
	}
}
