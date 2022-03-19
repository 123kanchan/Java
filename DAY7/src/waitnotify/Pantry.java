package waitnotify;

public class Pantry {
	private String[] menu = { "Kachauri", "Batata Vada", "Idlee", "MungVada",
			"Bhajiya", "Allu Wadi", "Poha", "Upma", "Shrikhand", "Shira" };
	
	private int nextItem = 0;
	
	public int getCount(){
		return menu.length;
	}
	
	public String nextItem(){
		return menu[nextItem++];
	}
}
