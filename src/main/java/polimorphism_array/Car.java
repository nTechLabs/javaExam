package polimorphism_array;

public class Car {
	
	Tire[] tires = {
			new Tire("frontLeftTire", 6),
			new Tire("frontRightTire", 2),
			new Tire("backLeftTire", 3),
			new Tire("backRightTire", 4)
	};
	
	int run() {
		System.out.println("running");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}

	private void stop() {
		System.out.println("car stop!");
	}
	
	
}
