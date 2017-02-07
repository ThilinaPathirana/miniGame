import java.util.ArrayList;

public class Mount {                                                          // Observable class
	ArrayList<Warrior> observers = new ArrayList<Warrior>();                  // observers(Warriors) array list

	public void attach(Warrior worrior) {                                     // atach warriors to the Observers ArrayList
		observers.add(worrior);
	}

	public void dettach(Warrior worrior) {                                    // detach  Obseravers Warriors
		observers.remove(worrior);
	}

	public void notifyAllWorriors() {                                         // Notify all the observers 
		for (Warrior worrier : observers) {
			worrier.setSomeonewon(true);
			worrier.setMobility(false);;
			;

		}

	}
}
