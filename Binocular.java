import java.util.Arrays;


public class Binocular {
	
	public synchronized void checkforTrees(SuperWarrior warrior){
		int x = warrior.getLocation()[0];
		int y = warrior.getLocation()[1];
		
		int[] leftside = {x-1,y};
		int[] rightside = {x+1,y};
		int[] infront = {x,y+1};
		int[] backward = {x,y-1};
		
		if(x>0 && GameMain.g.getGridpointObject(x-1, y,0) instanceof MagicTree){
			move(warrior, leftside);
		}
		if(x<10 && GameMain.g.getGridpointObject(x+1, y,0) instanceof MagicTree){
			move(warrior, rightside);
		}
		if(y<10 && GameMain.g.getGridpointObject(x, y+1,0) instanceof MagicTree){
			move(warrior, infront);
		}
		if(y>0 && GameMain.g.getGridpointObject(x, y-1,0) instanceof MagicTree){
			move(warrior, backward);
		}
	}
	
	public void move(SuperWarrior sWarrior , int[] Direction){
		System.out.println(sWarrior.getName()+"  found a Magic Tree at "+ Arrays.toString(Direction));
		sWarrior.setLocation(Direction);
		//System.out.println(sWarrior.getName()+" moves to "+ Direction[0]+" " +Direction[1]);
		GameMain.g.setGridpoint(Direction[0], Direction[1], this);
	}

}
