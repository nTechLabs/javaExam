package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExam1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class clazz = Class.forName("reflection.Car");
		
		System.out.println(clazz.getName());
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
			
		}
		System.out.println();
		
		System.out.println("�ʵ�����");
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		
		System.out.println("�޼ҵ� ����");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getReturnType().getSimpleName() + " ");
			System.out.print(method.getName() + "("); 
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
	}
	
	private static void printParameters(Class[] parameters) {
		for(int i =0; i< parameters.length ; i++) {
			System.out.print(parameters[i].getName());
			if(i < parameters.length-1) System.out.print(",");
		}
	}
}
