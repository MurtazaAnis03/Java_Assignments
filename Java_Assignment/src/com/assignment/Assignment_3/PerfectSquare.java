package Assignment_3;

public class PerfectSquare {
	public static boolean isPerfectSq(int num) {
		if(num < 0)
			return false;
		if(num == 0)
			return true;
		for(int i=1; i*i<=num; i++) {
			if(i*i == num) {
				return true;
			}
		}
		return false;
	}
}