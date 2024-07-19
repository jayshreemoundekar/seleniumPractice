package Day9;

public class Constructor {
	int x, y;
	String s;

	/*Constructor() {  //default constructor
		x = 100;
		y = 200;
		s = "Welcome";

	}*/

Constructor(int a,int b,String str) //parameterized constructor
{  
x=a;
y=b;
s=str;

}

	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor cs = new Constructor(); //we are invoking default constructor
		Constructor cs = new Constructor(10,20,"Welcome");  //we are invoking parameterized constructor
		cs.displayData();
	}

}
