package generalProgramsOnNumCharSpecial;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int count =10;
		System.out.println(a+"\t"+b);
	for (int i = 2; i <=count ; i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
		
	}

}
