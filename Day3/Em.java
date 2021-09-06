package Day3;

class Em {
	int Sapid;
	String name;
	String designation;
	String teamname;

	
	public Em(int Sapid, String name, String designation, String teamname) {
		this.Sapid = Sapid;
		this.name = name;
		this.designation = designation;
		this.teamname = teamname;
		}
	public void display() {
		System.out.println("SAPID\tNAME\tDESIGNATION\tTEAMNAME");
		System.out.println(Sapid+" \t"+name+" \t"+designation+"\t "+teamname);
	}
	public void salarydetails(double...e) {
		double total=0;
		for(double x:e) {						//Abstraction
			total+=x;
		}
		System.out.println("Salary:"+total);

		
	}

}

class Personal extends Em{
	String fathername;
	String address;
	double mobilenumber;
	int experience_year;
	double salary;
	public Personal(int Sapid, String name, String designation, String teamname) {
		super(Sapid, name, designation, teamname);
	}
	public Personal(int Sapid, String name, String designation, String teamname, String fathername, String address,
			double mobilenumber, int experience_year, double salary) {
		super(Sapid, name, designation, teamname);
		this.fathername = fathername;
		this.address = address;
		this.mobilenumber = mobilenumber;
		this.experience_year = experience_year;
		this.salary = salary;
	}
	public void display() {					//overrding
		System.out.println("FATHERNAME\tADDRESS\tMOBILNUMBER\tEXPERIENCE\tSALARY");
		System.out.println(fathername+"\t "+address+"\t "+mobilenumber+"\t "+experience_year+"\t "+salary);
	}
}

class Salary extends Em{				//Hierarchial Inheritance
	private int hoursofworking;			//Encapsulation
	double basic;
	double DA;
	double pf;
	double total;
	public Salary(int Sapid, String name, String designation, String teamname) {
		super(Sapid, name, designation, teamname);
	}
	public Salary(int Sapid, String name, String designation, String teamname, int hoursofworking, double basic,
			double dA, double pf, double total) {
		super(Sapid, name, designation, teamname);
		this.hoursofworking = hoursofworking;
		this.basic = basic;
		this.DA = DA;
		this.pf = pf;
		this.total = total;
	}
	
	public void salarydetails(double...a) {				//V_Argument
		double total=0;
		for(double x:a) {
			total+=x;
		}
		System.out.println("Salary:"+total);
	}
}