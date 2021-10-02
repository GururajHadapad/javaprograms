package programsOnString;

import java.util.HashSet;

public class StringPrintOnlyDuplicate {
	public static void main(String[] args) {
		String s="india";
		//create a set collection and add all char of given string
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//compare set collection with given string and increase the count if it matches
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i <s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			//print the char with count if it is reapeated twice
			if(count>1) {
			System.out.println(ch+"==>"+count);
			}
		}
	}
}