package arasakumaran;

public class Task99 {
	int rollno;  
	String name;  
	int age;
	int maths;
	int phy;
	int chem;
	int total;
	float avg;
	Task99(int rollno,String name,int age,int maths,int phy,int chem){  
		this.rollno=rollno;  
		this.name=name;
		this.age=age;
		this.maths=maths;
		this.phy=phy;
		this.chem=chem;
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+age+" "+" "+maths+" "+phy+" "+chem);
		}  
	int returntotal() {
		total=maths+phy+chem;
		return total;
	}
	float returnavg() {
		avg=total/3;
		return avg;

	}

}
