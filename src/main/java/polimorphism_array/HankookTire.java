package polimorphism_array;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRoration) {
		super(location, maxRoration);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "HankookTire ��ũ ****");
			return false;
		}
	}
	
}
