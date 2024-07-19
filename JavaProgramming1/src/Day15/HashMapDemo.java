package Day15;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap hm = new HashMap();

		// Map hm= new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// adding data pairs to hashmap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "John");
		hm.put(104, "Marry");

		System.out.println(hm); // {101=John, 102=Scott, 103=John, 104=Marry}
		System.err.println(hm.size());

		// remove pair

		hm.remove(103);
		System.out.println("After removing the pair:" + hm); // After removing the pair:{101=John, 102=Scott, 104=Marry}
		hm.get(102);

		// print only keys from hashmap

		System.out.println(hm.keySet()); // [101, 102, 104]

		// print values from HashMap
		for (Object k : hm.keySet()) {
			System.out.println(k + "" + hm.get(k));
			System.out.println(hm.get(k));
		}
		hm.clear();
		System.out.println(hm);
	}

}
