package polimorphism_array;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRoration) {
		this.location = location;
		this.maxRotation = maxRoration;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "Tire ��ũ ****");
			return false;
		}
	}
}
