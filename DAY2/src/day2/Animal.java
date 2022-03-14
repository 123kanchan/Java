package day2;

public abstract class Animal implements Registrationable {
	private int id;
	private double weight;
public abstract void eat();
	/*public void eat() {
		System.out.println("animal eating");
	}*/
public abstract void sleep();

public abstract void play();

Animal(int id,double weight)
{
	this.id=id;
	this.weight=weight;
	
}

@Override
public String toString() {
	return "Animal [id=" + id + ", weight=" + weight + "]";
}



}
class deer extends Animal implements Registrationable{
	public void register() {
		System.out.println("deer registered");
	}
	public deer(){
		
		super(2, 44);
	}
	
	public void eat() {
		System.out.println("eating");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	public void play() {
		System.out.println("playing");
	}
	public void runs() {
		System.out.println("running");
	}
}

class lion extends Animal implements Registrationable{
public void register() {
	System.out.println("lion registered");
	}
	public lion() {
		super(1,70);
	}
public void eat() {
	System.out.println(" lion eating");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	public void play() {
		System.out.println("playing");
	}
	public void hunt() {
		System.out.println("hunting");
	}
}
class elephant extends Animal implements Registrationable{
public void register() {
	System.out.println("elephant registered");
	}
	public elephant() {
		super(3,700);
	}
public void eat() {
	System.out.println("eating");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	public void play() {
		System.out.println("playing");
	}
	public void goingtoriver() {
		System.out.println("going to river");
	}
}