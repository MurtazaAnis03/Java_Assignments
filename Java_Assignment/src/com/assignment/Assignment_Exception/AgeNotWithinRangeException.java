package Assignment_Exception;

public class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String s) {
		System.out.println(s);
	}
}
