package Day12;

class Test
{
	int x =100;
}

public class finalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		t.x=200;  //incorrect, bcoz x is final variable
		System.out.println(t.x);

	}

}
