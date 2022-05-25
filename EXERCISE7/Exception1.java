/**Write a user defined exception class to authenticate
the user name and password */

import java.util.*;

class myException extends Exception{
	public myException(String s){
		super(s);
		}
	}
class Exception1{
	public static void main(String args[]){
		String username="junaid";
		String password="password";
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter username: ");
		String u=ob.next();
		System.out.print("Enter password: ");
		String p=ob.next();
		try{
		    if((u.equals(username))&&(p.equals(password))){
			throw new myException("Authentication success...");
		}
		    else{
			throw new myException("Authentication failed...");
			}
		}
		catch(myException ex){
			System.out.print(ex.getMessage()+"\n");
		}
	}
}

/**
OUTPUT
------
Enter username: abinraj
Enter password: 123456
Authentication failed...


Enter username: junaid
Enter password: password
Authentication success...

*/

