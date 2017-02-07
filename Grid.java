public class Grid {
	static Node[][] gridpoint = new Node[11][11];

	public void setGrid(){
		for (int i = 0; i < 11; i++) {                                            // Set the Grid 
			for (int j = 0; j < 11; j++) {
				gridpoint[i][j] = new Node();
			}
		}

		for (int k = 0; k < 5; k++) {                                            // Locating the Monsters on the Grid
			int x = GameMain.getMonsterList()[k].getLocation()[0];
			int y = GameMain.getMonsterList()[k].getLocation()[1];
			gridpoint[x][y].setNode(0, GameMain.getMonsterList()[k]);

		}
		
		for (int k=0 ;k<5;k++){                                                  // Locating the Trees on the Grid
			int x= GameMain.getTreeList()[k].getLocation()[0];
			int y= GameMain.getTreeList()[k].getLocation()[1];
			gridpoint[x][y].setNode(0, GameMain.getTreeList()[k]);
		}
		
		for (int k=0;k<4;k++){                                                   // Locating the Warriors on the Grid
			int x = GameMain.getWarriorList()[k].getLocation()[0];
			int y =GameMain.getWarriorList()[k].getLocation()[1];
			gridpoint[x][y].setNode(1,GameMain.getWarriorList()[k]);
		}
		
		gridpoint[5][5].setNode(0, GameMain.Mountdoom);                          // Locating the Mount doom on the Grid
	}
	
	public void setGridpoint(int x , int y, Object obj){                          // Setter for Grid point
		gridpoint[x][y].setNode(1, obj);
	}
	
	public void clearGridpoint(int x, int y){                                     // Clear the Grid point
		gridpoint[x][y].deleteNode();
	}
	
	public Object getGridpointObject(int x, int y , int position ){               // Getter for the object in the required gridpoint
		return gridpoint[x][y].getNode(position);
	}
	
	public static Object getCell(int x, int y){                                   // Getter for the cell
		return gridpoint[x][y];
	}
}
