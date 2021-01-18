
public class Reverse implements Reverser {

	
	
	// log base 2 for even number of characters 
	// log base 2 - 1 for odd number of characters in string
	
	
	@Override
	public boolean isReverse(String string1, String string2) {
			
		if(string1.length() != string2.length()) {
			return false;
		}
		
		int length = string1.length();
		// Even String
		if((length % 2) ==0) {
			
			for(int i = 0; i < (length/2) ; i++) {
				
				
				if(string1.charAt(i) == string2.charAt(((length-1)-i))) {
					continue;
				}else {
					return false;
				}
			}
			return true;
		}
		
		// Otherwise when odd perform the below
		for(int i = 0; i < ((length-1)/2) ; i++) {
			
			if(string1.charAt(i) == string2.charAt(((length-1)-i))) {
				continue;
			}else {
				return false;
			}
		}
			return true;
	}

}
