package promotion;

public class promotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e;  ��Ӱ��谡 �����Ƿ� �ڵ� Ÿ�Ժ�ȯ�� �ȵȴ�.
		//C c2 = d;  ��Ӱ��谡 �����Ƿ� �ڵ� Ÿ�Ժ�ȯ�� �ȵȴ�.
	}

}
