package newinstance;

public class NewInstanceExam1 {

	public static void main(String[] args) throws Exception {
//		Class clazz = Class.forName("newinstance.SendAction");
		
		Class clazz = Class.forName("newinstance.ReceiveAction");
		
		Action action = (Action)clazz.newInstance();
		action.execute();
		
	}

}
