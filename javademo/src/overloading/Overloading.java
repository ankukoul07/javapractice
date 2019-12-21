package overloading;

class Parent{
	public void m1(int i) {
		System.out.println("int arg param");
	}
	public void m1() {
		System.out.println("arg param");
	}
	public void m1(float i) {
		System.out.println("float arg param");
	}
}


public class Overloading {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.m1();
		p.m1('a');
		p.m1(10.4f);
	}

}
