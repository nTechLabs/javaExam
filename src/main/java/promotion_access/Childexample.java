package promotion_access;

public class Childexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		Parent p = c;
		
		p.method1();  // c 는 p로 부터 상송되었으므로 p의 method1을 호출할 수 있다.
		p.method2();  // p 는 c 가 대입되었으므로 c.method2 가 실행된다.
//		p.method3();  //P에서는 C의 mothod3을 호출할 수 없다.
	}

}
