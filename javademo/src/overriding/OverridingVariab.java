package overriding;

//overriding cocept not apllicable for variables
class ParentVar{
	int x=342;
}
class ChildVar extends ParentVar{
	Long x=431L;
}


public class OverridingVariab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentVar pv=new ParentVar();
		System.out.println(pv.x);
		
		ParentVar pv1=new ChildVar();
		System.out.println(pv1.x);
		
		ChildVar pv2=new ChildVar();
		System.out.println(pv2.x);
		
		
	}

}
