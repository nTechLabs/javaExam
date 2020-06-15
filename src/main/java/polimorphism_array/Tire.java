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
			System.out.println(location + "Tire ¼ö¸í :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "Tire ÆãÅ© ****");
			return false;
		}
	}
}
