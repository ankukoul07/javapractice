package overriding;


class ParentTwo{
	public static void display() {
		System.out.println("This is parent method");
	}
}
class ChildTwo extends ParentTwo{
	public static void display() {
		System.out.println("This is child method");
	}
}


public class OverridingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		ParentTwo pt=new ParentTwo();
		pt.display();
		
		ParentTwo pt1=new ChildTwo();
		pt1.display();//this concept is method hiding but not overriding
		
	}

}
