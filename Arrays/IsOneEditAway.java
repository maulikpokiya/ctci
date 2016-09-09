public class IsOneEditAway {

	public boolean ioea(String one, String two) {
		if(Math.abs(one.length() - two.length()) > 1)
			return false;
		
		int len1 = one.length();
		int len2 = two.length();
		
		if(len1 == len2) {
			
			int count = 0;
			
			for(int i=0; i<len1; i++) {
				
				if(one.charAt(i) != two.charAt(i)) {
					if(count > 0)
						return false;
					else
						count = count+1;
				}
			}
			return true;
		} else {
			int shorter = len1 < len2 ? len1 : len2;
			
			for(int i=0; i<shorter; i++) {
				
				if(one.charAt(i) != two.charAt(i)) {
					
					if(one.charAt(i+1) != two.charAt(i) && one.charAt(i) != two.charAt(i+1)) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
