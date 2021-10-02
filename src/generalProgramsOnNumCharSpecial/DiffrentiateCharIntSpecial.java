package generalProgramsOnNumCharSpecial;

public class DiffrentiateCharIntSpecial {

	public static void main(String[] args) {
		String s="GuRu13Raj@>>>>";
		String alpha="";
		String num="";
		String special="";


		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				num=num+c;
			}
			else if(Character.isAlphabetic(c)) {
				alpha=alpha+c;
			}
		
			else {
				special=special+c;
			}
		}
System.out.println("Alphabet  "+alpha);
System.out.println("number   "+num);
System.out.println("special  "+special);
	}

}
