package generalProgramsOnNumCharSpecial;

public class Demo {
	public Demo(double d) {
		this(10);
		System.out.println("this is double args cons");
	}
	Demo(int i){
		this();
		System.out.println("this is int args cons");
	}
	Demo(){
		System.out.println("this is no args cons");
	}

	public static void main(String[] args) {
Demo d = new Demo(11.5);
	}

}
