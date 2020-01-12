package objectpack;



public class Test {

	public String toString() {
		return null;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class c=Class.forName("java.lang.Object");
		java.lang.reflect.Method[] m=c.getDeclaredMethods();
		for(java.lang.reflect.Method m1:m) {
			System.out.println(m1.getName());
		}

	}

}
