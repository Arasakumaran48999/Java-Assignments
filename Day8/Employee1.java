package Day8;

import java.util.Comparator;

public class Employee1 implements Comparator{
	int rollno;
	String name;
	int salary;
	public Employee1(int rollno, String name, int salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.salary = salary;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    public int compare(Object o1,Object o2) {
		 Employee e=(Employee) o1;
		 Employee e1=(Employee) o2;
		 if(e.name.compareTo(e1.name)<0) {
			 return -1;
		 }
		 else if(e.name.compareTo(e1.name)>0) {
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
