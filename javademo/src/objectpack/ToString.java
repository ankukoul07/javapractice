package objectpack;

public class ToString {
	
	int rollno;
	String name;
	
	public ToString(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToString other = (ToString) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " [rollno=" + rollno + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString s=new ToString(1, "Ankush");
		System.out.println(s);
		
	}

}
