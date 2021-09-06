package Day5;
public class Multicash  {
	public static void main (String args[ ]) {
		try {
			int i = args.length; 	  // No of arguments in the command line
			String myString[] = new String[i];	
			// If i = 0 then  myString null pointer error
			if(myString[0].equals("Java")){  // #1 //
				System.out.println("First word is Java !");
			}
			System.out.println( " Number of arguments = " + i );
			int x = 12/ i; 	    // # 2 //
			int y[ ] = {555, 999}; // y is an array of size 2 with index 0,1
			y[ i ] = x;   //#3// Index is out-of-range may occur if i > 1
		}
		catch (ArithmeticException  e ) { 		// To catch the error at #2
			System.out.println ( " Div by 0 : "+ e );
		}
		catch (NullPointerException  e ) {		// To catch the error at #1
			System.out.println ( "A null pointer exception :" + e ); 
		} 
		catch (ArrayIndexOutOfBoundsException e ) { 
			// To catch the error at  #3
			System.out.println ("Array Index OOB : " + e);
		}
	}
}