package Day9;

public class GreetingsMain {

	
public static void main()
{
	Greetings gr= new Greetings();
	gr.greeting1();
	String str=gr.greeting2();
	System.out.println(str);
	 System.out.println(gr.greeting2());
	 gr.greeting3("John");
	 String str1=gr.greeting4("John");
	 System.out.println(str1);
	
}

}
