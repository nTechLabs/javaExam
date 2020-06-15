package polimorphism_array;

public class KumhooTire extends Tire{

	public KumhooTire(String location, int maxRoration) {
		super(location, maxRoration);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhooTire ¼ö¸í :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "KumhooTire ÆãÅ© ****");
			return false;
		}
	}
	
}
