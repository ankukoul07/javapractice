package overriding;

abstract class ParentOne{
	//parent method can be object but child cant be object--covarient return type is allowed
	//private modifier we cant use
	//cant override final methods i.e parent--final child non-final not allowed
	//abstract non-abstract overriding possible
	//cant decrease the scope of acess modifiers in child
	abstract Object display();
//	public Object display() {
//		System.out.println("This is parent method");
//		return null;
//	}
}
class Childone extends ParentOne{
	final public String display() {
		System.out.println("This is child method");
		return null;
	}
}


public class OverridingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childone co=new Childone();
		co.display();
	}

}
