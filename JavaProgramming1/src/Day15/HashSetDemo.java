package Day15;

public class HashSetDemo {

	public static void main(String[] args) {

		// declaration
		HashSetDemo myset = new HashSetDemo();
		// Set myset = new HashSet();
		// HashSet<Integer> myset=new HashSet<Integer>();

		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");

		myset.add(100);

		System.out.println(myset);
		
		System.out.println(myset.size());
		
		//remove value from HashSet
		
		myset.remove(10.5);  // we have to remove value but not index
		
		System.out.println("After removing"+myset);
		
		//get specific value from hashset-not possible
		
		//
		
		
		

	}

}
