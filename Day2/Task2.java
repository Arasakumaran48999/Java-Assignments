package arasakumaran;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character:");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c){
		    case 'a':
		        case 'e':
		            case 'i':
		                case 'o':
		                    case 'u':
		                        System.out.println("The given input is vowel");
		                        break;
		    default:{
		        System.out.println("The given input is not vowel");
		        break;
		    }
		}
	}

}
