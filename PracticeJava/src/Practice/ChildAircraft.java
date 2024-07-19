package Practice;

public class ChildAircraft extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildAircraft ca= new ChildAircraft();
		ca.bodyColour();
		ca.engine();
		ca.safetyGuidelines();
		

	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		 System.out.println("red colour on body");
		
	}

}
