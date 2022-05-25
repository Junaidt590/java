/**2. Find the average of N positive integers, raising a user
defined exception for each negative input.*/

import java.util.*;

class myException extends Exception{
	public myException(String s){
		super(s);
		}
	}
class Exception2{
	public static void main(String args[]){
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter the nuber of items: ");
	int a=ob.nextInt();


	int d;
	int total=0;
	int c=0;
	System.out.print("Enter Numbers: ");
	for(int i=a;i>0;i--){
		d=ob.nextInt();
		try{
		    if(d>=0){
			     c++;
			     total=total+d;
			}
			else{
			     throw new myException("negative numbers not allowed \n please enter positive numbers");
			     
			}
		}
		catch(myException ex){
			System.out.print(ex.getMessage()+"\n");
			}
			if(d<0){
				i=i+1;
			}
			}
			System.out.println("Average of "+c+" positive numbers="+(double)total/c);
			}
}
/**
OUTPUT
------
Enter the nuber of items: 5
Enter Numbers: 5
6
7
-9
negative numbers not allowed 
 please enter positive numbers
4
2
Average of 5 positive numbers=4.8
*/
