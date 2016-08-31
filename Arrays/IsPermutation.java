import java.util.Map;
import java.util.HashMap;

public class IsPermutation_1 {

	public boolean checkPermutation(String one, String two) {
		
		if(one.length() != two.length())
			return false;
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i=0; i<one.length(); i++) {
			char ch1 = one.charAt(i);
			char ch2 = two.charAt(i);
			
			Integer count1 = map1.get(ch1);
			Integer count2 = map2.get(ch2);
			
			if(count1 != null)
				map1.put(ch1, ++count1);
			else
				map1.put(ch1, 1);
			
			if(count2 != null)
				map2.put(ch2, ++count2);
			else
				map2.put(ch2, 1);
		}
		
		if(map1.size() != map2.size())
			return false;
		
		for(Map.Entry<Character,Integer> entry : map1.entrySet()) {
			char ch = entry.getKey();
			int num1 = entry.getValue();
			Integer num2 = map2.get(ch);
			
			if(num2 == null || num1 != num2)
				return false;
		}
		
		return true;
	}
}
