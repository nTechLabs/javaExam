package promotion_access;

public class Childexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		Parent p = c;
		
		p.method1();  // c �� p�� ���� ��۵Ǿ����Ƿ� p�� method1�� ȣ���� �� �ִ�.
		p.method2();  // p �� c �� ���ԵǾ����Ƿ� c.method2 �� ����ȴ�.
//		p.method3();  //P������ C�� mothod3�� ȣ���� �� ����.
	}

}
