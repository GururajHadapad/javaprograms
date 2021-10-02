package bubbleSortingAlphabet;

public class BubbleSortingPrintMinLengthOfString {
public static void main(String[] args) {
	String s[]= {"hello","hi","to","saverr","hidden","ok"};
	String min=s[0];
	for (int i = 1; i < s.length; i++) {
		if(min.length()>s[i].length()) {
			min=s[i];
		}
	}
	for (int i = 0; i < s.length; i++) {
		if(min.length()==s[i].length()) {
			System.out.println(s[i]);
		}
	}
}
}
