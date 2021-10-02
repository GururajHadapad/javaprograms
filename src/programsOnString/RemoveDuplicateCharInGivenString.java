package programsOnString;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInGivenString {
	public static void main(String[] args) {
		String s="pakisthan";
		//create a set collection and add all char of given string
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
	for (Character ch : set) {
		System.out.println(ch);
	}
}
}