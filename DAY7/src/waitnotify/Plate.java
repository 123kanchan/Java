package waitnotify;;

public class Plate {
	private String menuItem;
	private boolean spaceToServe = true;

	synchronized void serve(String menuItem) throws InterruptedException {
		if (!spaceToServe) {//waiter go to wait state beacuse plate is not empty
			wait();
		}
		this.menuItem = menuItem;
		spaceToServe = false;
		System.out.println("Serving:" + this.menuItem);
		notify();//guest is notified that item is served now guest gone to wait state
	}

	synchronized String eat() throws InterruptedException { 
		if (spaceToServe) {
			wait();//guest going in wait state as no item is served
		}
		spaceToServe = true;
		System.out.println("\tEating:" + this.menuItem);
		notify();//guest notified waiter to seerve another item
		return menuItem;
	}
}
