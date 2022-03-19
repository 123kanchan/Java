package waitnotify;
//producer consumer or supplier consumer 
/*consumer places order and supplier make ready product  consumer picks up the product 
 * consumer waits for reciept of the product 
 * */
public class TestCommunication {

	public static void main(String[] args) {
		Plate plate = new Plate();
		Pantry pantry = new Pantry();
		
		Thread waiter = new Thread(new Waiter(plate, pantry));
		Thread guest  = new Thread(new Guest(plate));
		
		waiter.start();
		guest.start();
	}
}
