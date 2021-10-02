package collectionProgram;

import java.util.TreeSet;

public class ProgramsOnTreeSet {
public static void main(String[] args) {
	TreeSet tset = new TreeSet();
	tset.add(10);
	tset.add(40);
	tset.add(20);
	tset.add(30);
	//tset.add("guru");====we will get class cast exception
	//tset.add(null);=====we will get null pointer exception
	System.out.println(tset);
}
}
