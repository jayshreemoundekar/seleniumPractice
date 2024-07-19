package Day12;

public class PQR  extends MNO implements ABC,XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PQR obj= new PQR();
		obj.m1();
		obj.m2();
		obj.m3();

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("This is m2 from XYZ");
		
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("This is m2 from ABC");
		
	}

}
