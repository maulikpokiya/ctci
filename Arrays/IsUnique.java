public class IsUnique {

	public void isUnique1(String input) {
		
		// First Approach:
		// Runtime Analysis: Time Complexity: O(n^2)
		//                   Space complexity: O(1)
		
		char ch;
		boolean b = false;
		
		for(int i=0; i<input.length()-1; i++) {
			ch = input.charAt(i);
			
			if(input.indexOf(ch, i+1) != -1) {
				System.out.println("Not Unique");
				b = true;
				break;
			}
		}
		
		if(!b)
			System.out.println("Is Unique");
	}
	
	// Second approach
	// Runtime analysis: Time Complexity: O(n^2)
	//                   Space Complexity: O(1)
	
	public void isUnique2(String input) {
		
		char ch;
		boolean b = false;
		
		for(int i=0; i<input.length()-1; i++) {
			
			ch = input.charAt(i);
			
			for(int j=i+1; j<input.length(); j++) {
				if(ch == input.charAt(j)) {
					b = true;
					System.out.println("Not Unique");
					break;
				} // End If
			} // Inner For
		} // Outer For
		
		if(!b)
			System.out.println("Is Unique");
	}
	
	// Third approach
	public boolean isUnique3(String str) {
		// Make sure if this string is ASCII or Unicode.
		// Total number of characters in ASCII chart is 128. In Extended ASCII, it is 256.
		// Total characters in Unicode is 109,384. 
		// Source: http://stackoverflow.com/questions/5924105/how-many-characters-can-be-mapped-with-unicode
		
		// Assumption: input string has only ASCII characters.
		// Time complexity: O(n)
		// Space complexity: O(1)
		
		if(str.length() > 128)
			return false;
		
		boolean[] char_set = new boolean[128];
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i); // returns ASCII value of character
			
			if(char_set[val]) { // Already found this char in string
				return false;
			}
			
			char_set[val] = true;
		}
		return true;
	}
	
	// Fourth approach
	public boolean isUnique(String input) {
		
		char[] inArr = input.toCharArray();
		Arrays.sort(inArr);
		
		for(int i=0; i<inArr.length; i++) {
			
			if(inArr[i] == inArr[i+1]) {
				System.out.println("Is not unique");
				return false;
			}
		}
		return true;
	}
}
