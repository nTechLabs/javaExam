package polimorphism;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRoration) {
		super(location, maxRoration);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ¼ö¸í :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "HankookTire ÆãÅ© ****");
			return false;
		}
	}
	
}
