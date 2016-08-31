import java.util.Arrays;

/**
 * input: "Mr John Smith    ", 13
 * output: "Mr%20John%20Smith"
 * 
 * @author Maulik
 *
 */

public class URLify_1 {

	public String makeURL(String input, int len) {

		char[] inArr = input.toCharArray();
		int d = input.length() - len;
		int count = 0;

		for(int i=len-1; i>=0; i--) {

			if(inArr[i] != ' ') {
				inArr[i+d-count] = inArr[i];
			} else {
				inArr[i+d-count] = '0';
				inArr[i+d-1-count] = '2';
				inArr[i+d-2-count] = '%';
				count+=2;
			}
		}
		return Arrays.toString(inArr);
	}

	public static void main(String[] args) {
		URLify_1 ur = new URLify_1();
		String str = ur.makeURL("Mr John Smith    ", 13);
		System.out.println(str);
	}
}
