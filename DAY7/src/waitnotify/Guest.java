package waitnotify;

public class Guest implements Runnable {
	private Plate plate;
	
	public Guest(Plate plate){
		this.plate = plate;
	}
	
	public void run() {
		String str;
		try {
			while (!((str = plate.eat())
					.equalsIgnoreCase("FingerBowl")))
				;
			System.out.println("Loud Burp!!  Nice dining. Thanks.");
		}

		catch (InterruptedException ie) {
			System.out.println("Exception while getting string.");
		}
	}
}
