package collectionProgram;

import java.util.HashMap;

public class ProgramsOnHashmap {

	public static void main(String[] args) {
HashMap hmap = new HashMap();//its hetrogenius
hmap.put(1, 100);
hmap.put(2, 200);
hmap.put(3, "guru");
hmap.put(4, "guru");
hmap.put(5, 500);
hmap.put("a", 100);
hmap.put("a", "guru");// it will override the older value
hmap.put("a", 100);
hmap.put(null, 1000);
hmap.put(null, 2000);
System.out.println(hmap);
	}

}
