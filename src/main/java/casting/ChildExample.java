package casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";  child 의 field2를 쓸수 없다.
//		parent.method3(); child 의 method3를 사용할 수 없다.
		
//		쓰려면 강제 타입변환을 해서 쓸 수 있다. 
		
		Child child = (Child)parent;
		child.field2 = "data2";
		child.method3();
		child.method1();
		child.method2();
	}

}
