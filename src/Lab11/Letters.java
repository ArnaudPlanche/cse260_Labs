package Lab11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Letters {
	
	
	public static void main(String[] args) {
		System.out.println("Enter file name: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		Map<Character, Integer> vowels = new HashMap<Character, Integer>() {
			{
				put('A', new Integer(0));
				put('E', new Integer(0));
				put('I', new Integer(0));
				put('O', new Integer(0));
				put('U', new Integer(0));

			}
		};
		int cCount = 0;
		int vCount = 0;

		for(int i = 0; i < s.length(); i++) {
			char ch = Character.toUpperCase(s.charAt(i));
			if(Character.isLetter(ch)) {
				if(vowels.containsKey(ch)) {
					int count = vowels.get(ch)+1;
					vowels.put(ch, count);
					vCount++;
				} else {
					cCount++;
				}
			}
		}
		
		System.out.println("Number of Vowels: " + vCount);
		System.out.println("Number of Consonants: " + cCount);

	}
}
