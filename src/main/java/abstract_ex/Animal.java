package abstract_ex;

public abstract class Animal {
	public String kind;
	public void breath() {
		System.out.println("Breath");
	}
	
	public abstract void sound();
}
