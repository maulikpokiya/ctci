import java.math.BigDecimal;
import java.util.Map;
import java.util.HashMap;

public class PelindromePermute {

	public boolean pelindromePermutation(String input) {
		if(input == null)
		return false;
		
		if(input.length() == 1)
			return true;
		
		Map<Character, Integer> newmap = new HashMap<Character, Integer>();
		input = input.toLowerCase();
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(newmap.containsKey(ch))
				newmap.put(ch, newmap.get(ch)+1);
			else
				newmap.put(ch, 1);
		} // End For-loop
		
		int count = 0;
		for(Map.Entry<Character, Integer> entry : newmap.entrySet()) {
			char ch = entry.getKey();
			int num = entry.getValue();
			
			if(ch == ' ')
				continue;
			if(count == 1 && num%2 != 0)
				return false;
			if(num%2 != 0) {
				count = count+1;
				continue;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		PelindromePermute pm = new PelindromePermute();
		boolean bool = pm.pelindromePermutation("Tact Coa");
		System.out.println(bool);
	}
}
