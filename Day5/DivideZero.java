package Day5;

public class DivideZero {
	static int anyFunction (int x, int y ){
		try {
			int a = x/y;
			return a;
		} 
		catch (ArithmeticException e) {								//DIVIDEBYZERO -ARITHMETIC EXCEPTION
			System.out.println ( "Division by zero" );
		}
		return 0;
	}
	public static void main (String args[]) {
		int a,b, result;
		a=0;
		b=0;
		System.out.print("Enter any two integers : ");
		try{
		a = System.in.read();
		b = System.in.read();
		}catch(Exception e){}
		result  = anyFunction (a, b); 
		System.out.println ( "Result : " + result);
	}
}

