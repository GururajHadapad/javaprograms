package collectionProgram;

import java.util.TreeMap;

public class ProgramsOnTreemap {

	public static void main(String[] args) {

	TreeMap tmap = new TreeMap();
	tmap.put(1, 100);
	tmap.put(2, 200);
	tmap.put(3, 300);
	tmap.put(4, 400);
	
	//tmap.put(null, 100);// null pointer exception
	tmap.put(5, null);
	
	//tmap.put("a", 1000);// class cast exception
	tmap.put(6, "a");
	System.out.println(tmap);
	}

}
