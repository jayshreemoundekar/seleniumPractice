package Day9;

public class ThisKeyword {
	
	int x,y;  //instance variable //class variable
	/*void setData(int a, int b)  //local variable/ method variable
	{
		this.x=x;
		this.y=y;
	}*/
	ThisKeyword(int a,int b)
	{
		this.x=a;
		this.y=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		ThisKeyword th= new ThisKeyword(10, 20);
		//th.setData(10, 20);
		th.display();
		

	}

}
