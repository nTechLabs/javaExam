package polimorphism_array;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<100; i++) {
			int problemLocation = car.run();
			if(problemLocation !=0) {
				System.out.println(car.tires[problemLocation-1].location + "HanTire ·Î ±³Ã¼");
				car.tires[problemLocation] = new HankookTire(car.tires[problemLocation-1].location, 50);
			}
			System.out.println("---------------------");
		}
		
	}

}
