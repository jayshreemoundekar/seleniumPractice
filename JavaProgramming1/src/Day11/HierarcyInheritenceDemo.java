package Day11;

class Parent {
	void display(int a) {
		System.out.println(a);
	}
}

class Child1 extends Parent {
	void show(int b) {
		System.out.println(b);
	}
}

class Child2 extends Parent {
	void print(int c) {
		System.out.println(c);
	}
}

public class HierarcyInheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		c1.display(1000);
		c1.show(2000);

		Child2 c2 = new Child2();
		c2.display(10);
		c2.print(50);

	}

}
