import Arithematic.*;
import java.util.*;

class Pack2{
	public static void main(String args[]){

				Scanner sc=new Scanner(System.in);
				System.out.println("Enter two numbers: ");
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				Add ad=new Add();
				ad.Result(a,b);

				Sub s=new Sub();
				s.Result(a,b);

				Mul m=new Mul();
				m.Result(a,b);

				Div d=new Div();
				d.Result(a,b);
				}
}

/**
OUTPUT
------
Enter two numbers: 
20 10
Addition Result
Result=30
----------
Subtraction Result
Result=10
----------
Multiplication Result
Result=200
----------
Division Result
Result=2
----------
*/
