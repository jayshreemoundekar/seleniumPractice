package Day15;

import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// declaration

		ArrayListDemo mylist = new ArrayListDemo();

		// ArrayList mylist= new ArrayList();

		// List mylist = new ArrayList();

		// adding data element into arraylist

		// adding data elements into arraylist

		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);

		// size of an arrayList

		System.out.println(mylist.size());
		System.out.println(mylist);

		// remove value from arraylist

		mylist.remove(3);
		System.out.println("After removing element" + mylist);

		// inserting new element in the middle of list

		mylist.add(100, "java");
		System.out.println("after insertion" + mylist);
		System.out.println(mylist.get(3));

		// read all the data from arraylist

		for (Object x : mylist) {
			System.out.println(x);
		}

		mylist.clear();
		System.out.println("After clearing" + mylist);
		
	}

}
