package Day8;

public class Employee implements Comparable{
	int rollno;
	String name;
	int salary;
	public Employee(int rollno, String name, int salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    public int compareTo(Object o) {
		 Employee e=(Employee) o;
		 if(this.salary>e.salary) {
			 return -1;
		 }
		 else if(this.salary<e.salary) {
			 return 1;
			 
		 }else {
			 return 0;
		 }
	    }
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}
}
