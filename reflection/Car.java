package reflection;

import java.lang.reflect.Method;

public class Car {
	
	public String model;
	public String owner;
	
	private Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}

    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}
}