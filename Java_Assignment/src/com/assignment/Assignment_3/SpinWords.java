package Assignment_3;

public class SpinWords {
	static String spinWords(String str) {
		String [] s = str.split("\\s");
		for(int i=0; i<s.length; i++) {
			if(s[i].length() >=5) {
				s[i] = reverseStr(s[i]);
			}
		}
		String output ="";
		for(String st: s) {
			output = output.concat(st+" ");
		}
		return output;
	}
	
	static String reverseStr(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
}
