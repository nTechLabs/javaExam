package casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";  child �� field2�� ���� ����.
//		parent.method3(); child �� method3�� ����� �� ����.
		
//		������ ���� Ÿ�Ժ�ȯ�� �ؼ� �� �� �ִ�. 
		
		Child child = (Child)parent;
		child.field2 = "data2";
		child.method3();
		child.method1();
		child.method2();
	}

}
