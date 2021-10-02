package collectionProgram;

import java.util.HashSet;

public class ProgramOnHashset {

	public static void main(String[] args) {
HashSet hset = new HashSet();
hset.add(10);
hset.add(20);
hset.add("guru");
hset.add('g');
hset.add(40);
hset.add(80);
hset.add(15);
hset.add(10);
hset.add(15);
hset.add(null);
hset.add(null);

System.out.println(hset);
	}

}
