package Day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Student implements Comparable {
	int rollno;
	String name;
	String addr;
	int maths;
	int science;
	int social;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + ", maths=" + maths + ", science="
				+ science + ", social=" + social + ", total=" + total + ", avg=" + avg + "]";
	}
	int total;
	int avg;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String addr, int maths, int science, int social, int total, int avg) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.total = total;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student e=(Student) o;
		 if(this.total>e.total) {
			 return 1;
		 }
		 else if(this.total<e.total) {
			 return -1;
			 
		 }else {
			 if(this.maths>e.maths) {
				 return 1;
			 }
			 else if(this.maths<e.maths) {
				 return -1;
				 }else {
					 if(this.science>e.science) {
						 return 1;
					 }
					 else if(this.science<e.science) {
						 return -1;
						 }else {
							 if(this.social>e.social) {
								 return 1;
							 }
							 else if(this.social<e.social) {
								 return -1;
								 }else {
									 return 0;
								 }
						 }
				 }
			 
		 }
	}
}


