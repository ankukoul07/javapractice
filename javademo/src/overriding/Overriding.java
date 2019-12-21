package overriding;

class Parent{
	public void display() {
		System.out.println("This is parent method");
	}
}
class Child extends Parent{
	public void display() {
		System.out.println("This is child method");
	}
}


public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Parent();
		p.display();
		
		Child c=new Child();
		c.display();
		
		Parent p1=new Child();
		p1.display();
		
		
	}

}
