
public class Node {
	
	Object[] cell = new Object[2];                           // relevent cell of the grid 
	
	public void setNode(int position, Object obj){           // set the node in the Grid
		cell[position]=obj;
	}
	public void deleteNode(){                                // delete the node in the grid
		cell[1]=null;
	}
	
	public Object getNode(int position){                     // get the Object of the relevant node cell
		return cell[position];
	}
}
