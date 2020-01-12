package exception;

public class DefaultException {

	public static void doStuff() throws Exception
	{
		doMoreStuff();
		
	}
	public static void doMoreStuff() throws Exception {
		System.out.println(10/0);
		System.out.println("Hello");
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try {
			doStuff();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(Constant.a);
		} 
	}

}
