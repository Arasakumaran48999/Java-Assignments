package Day5;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name:");
		String username=sc.next();
		System.out.println("Enter the password:");
		String password=sc.next();
		Login l=new Login();
		
		if(l.length(username,password)) {
			if(l.check(username,password)) {
				if(l.symbol(username,password)) {
					if(l.revers(username,password)) {
						System.out.println("Your username and paddword is correct you may login in now");
					}else {
						System.out.println("your password is incorrect");
					}
				}else {
					System.out.println("your password should contain symbols");
				}				
			}else {
				System.out.println("your username and password shouldcontain atleast one small, capita and number");
			}
		}else {
			System.out.println("The length must be between 8 to 33");
		}
		
		
		
	}
	public boolean length(String user,String pass) {
		if((user.length()>=8)&&(user.length()<=33)&&(pass.length()>=8)&&(pass.length()<=33)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean revers(String user,String pass) {
	    int flag=0;
		String reverse = new StringBuffer(pass).reverse().toString();
		int j=reverse.length()-1;
	    for(int i=0;i<user.length();i++){
	        if((user.charAt(i)==reverse.charAt(j))&&(flag==0)) {
	    	    flag=0;
	        }else {
	    	    flag=1;
	        }
	        j--;
	    }
	    if(flag==1){
	        return true;
	    }else{
	        return false;
	    }
	}
	public boolean symbol(String user,String pass) {
		int flag=0;
	        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
	        for (int i=0; i < user.length() ; i++)
	        {
	            char ch = user.charAt(i);
	            if((specialCharactersString.contains(Character.toString(ch)))) {
	                flag=1;
	                break;
	             }
	        }
	        if(flag==1) {
            	return true;
            }else {
            	return false;
            }
	}
	public boolean check(String user,String pass) {
		char ch;
	    boolean capitalFlag = false;
	    boolean lowerCaseFlag = false;
	    boolean numberFlag = false;
	    for(int i=0;i < user.length();i++) {
	        ch = user.charAt(i);
	        if( (Character.isDigit(ch))){
	            numberFlag = true;
	        }
	        if ((Character.isUpperCase(ch))) {
	            capitalFlag = true;
	        } 
	        if ((Character.isLowerCase(ch))) {
	            lowerCaseFlag = true;
	        }
	        if(numberFlag && capitalFlag && lowerCaseFlag)
	            return true;
	    }
	    return false;
	}
}
