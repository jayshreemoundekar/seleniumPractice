package Practice;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new AustralianTraffic();
		ContinentalTraffic ct = new AustralianTraffic();
		a.flashYellow();
		a.greengo();
		a.redStop();
		ct.TrainSymbol();

		AustralianTraffic at = new AustralianTraffic();
		at.walkonsymbo();

	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub

		System.out.println("redstop implementation");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("greeen stop implementation");

	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub

	}

	public void walkonsymbo() {
		System.out.println("walk on symbol");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub

	}

}
