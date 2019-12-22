package staticinstaceblock;

public class InstanceExample {

	int x=10;
	{
		m1();
		System.out.println("FIB");
	}
	InstanceExample()
	{
		System.out.println("Constuctor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceExample e=new InstanceExample();
		System.out.println("main");
	}
	{
		System.out.println("SIB");
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(y);
	}
	int y=20;

}
