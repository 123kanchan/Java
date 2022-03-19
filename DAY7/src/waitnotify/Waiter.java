package waitnotify;

public class Waiter implements Runnable {
	Plate plate;
	Pantry pantry;
	
	public Waiter(Plate plate, Pantry pantry){
		this.plate = plate;
		this.pantry = pantry;
	}
	
	public void run() {
		try {
			for (int i = 0; i < pantry.getCount(); i++) {
				plate.serve(pantry.nextItem());
			}
			plate.serve("FingerBowl");
			System.out.println("Thanks.  Hope it is good hospitality.");
		} catch (InterruptedException ie) {
			System.out.println("Exception while putting string.");
		} 
	}
}
