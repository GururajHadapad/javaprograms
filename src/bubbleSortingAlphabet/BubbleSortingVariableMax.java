package bubbleSortingAlphabet;

public class BubbleSortingVariableMax {

	public static void main(String[] args) {
		String s[]= {"hello","bye","hi","saver","hidden"};
		String max=s[0];
		for (int i = 1; i < s.length; i++) {
			if(max.length()<s[i].length()) {
				max=s[i];
			}
		}
		System.out.println("string with max length "+max);
	}

}
