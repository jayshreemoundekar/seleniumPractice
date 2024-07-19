package Practice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		String t = "hello";
		String x = s.concat("world");
		String m = new String("Hi");
		System.out.println(s);
		
		System.out.println(s.equals(t));
		System.out.println(s==t);

		StringBuffer sb = new StringBuffer("hello");

		sb.append("world");

		System.out.println(sb);

		sb.replace(5, 7, "aa");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder();

	}

}
