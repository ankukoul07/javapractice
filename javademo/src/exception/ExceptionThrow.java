package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionThrow {

	
	public static void main(String[] args) throws FileNotFoundException  {
		
		dostuff();
	}

	private static void dostuff() throws FileNotFoundException {
		// TODO Auto-generated method stub
		doMoreStuff();
	}

	private static void doMoreStuff() throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("abc.txt");
	}

}
