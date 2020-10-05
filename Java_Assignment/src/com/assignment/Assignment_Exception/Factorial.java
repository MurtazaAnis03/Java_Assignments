package Assignment_Exception;

class FactorialException extends Exception{
	public FactorialException(String s) {
		System.out.println(s);
	}
}

class InvalidInputException extends Exception{
	public InvalidInputException(String s) {
		System.out.println(s);
	}
}

public class Factorial {
	public static int getFactorial(int num) throws InvalidInputException, FactorialException {
		int fact = 1;
		if(num<2) {
			throw new InvalidInputException("Input number should be greater than or equal to 2");
		}
		for(int i=num; i>0; i--) {
			if(fact > Integer.MAX_VALUE) {
				throw new FactorialException("factorial is out of int range");
			}
			fact = fact*i;
		}
		return fact;
	}
}