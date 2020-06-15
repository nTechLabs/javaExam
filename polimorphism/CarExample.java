package polimorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<100; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1 : 
				System.out.println("frontLeftTire change HankookTire");
				car.frontLeftTire = new HankookTire("frontLeftTire", 15);
				break;
				
			case 2 : 
				System.out.println("frontRightTire change KumhooTire");
				car.frontRightTire = new KumhooTire("frontRightTire", 13);
				break;
				
			case 3 : 
				System.out.println("backLeftTire change HankookTire");
				car.backLeftTire = new HankookTire("backLeftTire", 14);
				break;
				
			case 4 : 
				System.out.println("backRightTire change KumhooTire");
				car.backRightTire = new KumhooTire("backRightTire", 17);
				break;
				
				default :
			}
			System.out.println("---------------------");
		}
		
	}

}
