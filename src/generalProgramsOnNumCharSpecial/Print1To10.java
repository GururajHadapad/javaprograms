package generalProgramsOnNumCharSpecial;

public class Print1To10 {
public static void main(String[] args) {
	
	
	for (int i = 1; i <=10; i++) {
		System.out.println(i);
	}
	
System.out.println("================================================");


System.out.println("printing odd num");
	for (int j = 1; j<=10; j++) {
		if(j%2==1) {
			
		System.out.println(j);
		}
	}
	
	System.out.println("=========================================");
	
	System.out.println("printing even num");
	for (int j = 1; j<=10; j++) {
		if(j%2==0) {
			
		System.out.println(j);
		}
	}
}
}
