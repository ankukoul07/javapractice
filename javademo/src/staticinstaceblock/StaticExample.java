package staticinstaceblock;

public class StaticExample {

	static int x=10;
	static {
		m1();
		System.out.println("FSB");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("main method");
	}

	public static void m1() {
		// TODO Auto-generated method stub
		System.out.println(y);
	}
	static int y=20;

}
