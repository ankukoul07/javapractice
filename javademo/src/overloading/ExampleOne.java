package overloading;


class ParentOne{

	public void m1(Object o) {
		System.out.println("Object param");
	}
	public void m1(String s) {
		System.out.println("String param");
	}
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer param");
	}
	
}
public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentOne parentOne=new ParentOne();
		parentOne.m1(new Object());
		//parentOne.m1(null);
		parentOne.m1("abc");
		parentOne.m1(new StringBuffer());
	}

}
