package docs3codetopractice;

public class InvalidProductIdException extends Exception{

	public InvalidProductIdException(String message) {
	super(message);
	}
	public InvalidProductIdException(String message,Throwable cause) {
		super(message);
		}
}
