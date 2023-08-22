package exception;

public class NameBlankException extends Exception {
	//this is the exception for blank name
	public NameBlankException() {
		super("Item name cannot be blank! This item will not be added.");
	}

}
