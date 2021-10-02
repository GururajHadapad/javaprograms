package bubbleSortingAlphabet;

public class BubbleSortingVariableMin {

	public static void main(String[] args) {
String s[]= {"hello","bye","hi","saver","hidden"};
String min=s[0];
for (int i = 1; i < s.length; i++) {
	if(min.length()>s[i].length()) {
		min=s[i];
	}
}
System.out.println(min);
	}

}
