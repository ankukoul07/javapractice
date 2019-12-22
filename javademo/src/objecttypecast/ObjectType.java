package objecttypecast;

public class ObjectType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*CTcheck1 A b=(C)d there shb some relation b/w C and d
		CTcheck 2C must be same or derived type of A
		RTcheck :runtime object of d must be same or derived type of C*/
		Object o=new String("ABC");
		StringBuffer sb=(StringBuffer)o;
		
		Object o1=new String("ABC");
		Object sb1=(String)o1;
		System.out.println();
	}

}
