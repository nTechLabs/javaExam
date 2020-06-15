package instance_of;

public class InstanceOfExample {
	
	public static void method(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("Ok!!");
		}else {
			System.out.println("Not ok");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Parent();
		method(parentA);
		
		parentA = new Child();
		method(parentA);
	}

}
