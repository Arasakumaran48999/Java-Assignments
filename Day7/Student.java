package Day7;

import java.io.Serializable;

public class Student implements Serializable{
	long rollno;
	String name;
	String department;
	String address;
	public Student(long rollno, String name, String department, String address) {
		this.rollno = rollno;
		this.name = name;
		this.department = department;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", department=" + department + ", address=" + address
				+ "]";
	}
	
}
