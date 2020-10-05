package Assignment_Exception;

public class NameNotValidException extends Exception{
	public NameNotValidException(String s) {
		System.out.println(s);
	}
}
