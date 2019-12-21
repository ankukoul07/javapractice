package aggregation;

public class Employee {
	
	private String empName;
	private Long empCode;
	private Address addr;

	Employee(String empName,Long empCode,Address addr){
		this.empName=empName;
		this.empCode=empCode;
		this.addr=addr;
		
	}

	public void display() {
		System.out.println("Employee Name is :"+empName+" "+empCode);
		System.out.println("Employee Address is :"+addr.getCity()+" "+addr.getState()+" "+addr.getPin());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address adr=new Address();
		adr.setCity("Pune");
		adr.setPin(13L);
		adr.setState("MH");
		
		Employee employee=new Employee("Ankush",1L,adr);
		employee.display();
		
		
	}

}
