package overriding;

//overriding wrt var-arg methods both child and parent should containg var arg methods else it
//will be overloading not overriding 
class ParentClass{
	public void display(int... a) {
		System.out.println("This is parent method");
	}
}
class ChildClass extends ParentClass{
	public void display(int... a) {
		System.out.println("This is child method");
	}
}


public class OverridingVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ParentClass pc=new ChildClass();
		pc.display(1);
		pc.display();
		
	}

}
