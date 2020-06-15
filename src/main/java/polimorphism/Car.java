package polimorphism;

public class Car {
	Tire frontLeftTire = new Tire("frontLeftTire", 6);
	Tire frontRightTire = new Tire("frontRightTire", 2);
	Tire backLeftTire = new Tire("backLeftTire", 3);
	Tire backRightTire = new Tire("backRightTire", 4);
	
	int run() {
		System.out.println("running");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	private void stop() {
		System.out.println("car stop!");
	}
	
	
}
