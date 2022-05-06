/**Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit the properties of class employee and contain its own data members department, Subjects taught and constructors
to initialize these data members and also include display function to display all the data members. Use array of objects to display details of N teachers */

import java.util.*;
class Employee
    {
     int Empid;
     String Name;
     double Salary;
     String Address;
     void Employee(int id,String name,double salary,String address){

     Empid=id;
     Name=name;
     Salary=salary;
     Address=address;
    }
}
    class Teacher extends Employee
	{
	String department;
	String subject;

	Teacher(String dept,String sbjt,int id,String name,double salary,String address){
	
	department=dept;
	subject=sbjt;
	
	Empid=id;
	Name=name;
	Salary=salary;
	Address=address;
	}

void Display(){
	System.out.println("EMPID:"+Empid+"\nNAME:"+Name+"\nSALARY:"+Salary+"\nADDRESS:"+Address);
	System.out.println("DEPARTMENT:"+department+"\nSUBJECT:"+subject);
	System.out.println("----------------------------");
	      }
}
	class Emp{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of teachers: ");
		int n=sc.nextInt();
		

	Teacher[] arr;
	arr=new Teacher[n];
	int array[]=new int[n];
	for(int i=0;i<n;i++){
		System.out.println("Enter the details of "+(i+1)+"th Teacher");

		System.out.println("Enter Empid: ");
		int id=sc.nextInt();

		System.out.println("Enter Employee Name: ");
		String name=sc.next();

		System.out.println("Enter Employee Salary: ");
		double salary=sc.nextDouble();

		System.out.println("Enter Employee Address: ");
		String address=sc.next();

		System.out.println("Enter Department: ");
		String dept=sc.next();

		System.out.println("Enter subject taught: ");
		String sbjt=sc.next();

		arr[i]=new Teacher(dept,sbjt,id,name,salary,address);
		
		System.out.println("--------------------\n");
		}
	for(int j=0;j<n;j++){
		System.out.println("Details of Teachers"+(j+1));

		arr[j].Display();
		}
	}
}

/**
OUTPUT
------
Enter the no of teachers: 
2
Enter the details of 1th Teacher
Enter Empid: 
101
Enter Employee Name: 
Arjun
Enter Employee Salary: 
15000
Enter Employee Address: 
Ernakulam
Enter Department: 
Mech
Enter subject taught: 
Maths
--------------------

Enter the details of 2th Teacher
Enter Empid: 
102
Enter Employee Name: 
Adil
Enter Employee Salary: 
26000
Enter Employee Address: 
Ramanatukara
Enter Department: 
Civil
Enter subject taught: 
Maths
--------------------

Details of Teachers1
EMPID:101
NAME:Arjun
SALARY:15000.0
ADDRESS:Ernakulam
DEPARTMENT:Mech
SUBJECT:Maths
----------------------------
Details of Teachers2
EMPID:102
NAME:Adil
SALARY:26000.0
ADDRESS:Ramanatukara
DEPARTMENT:Civil
SUBJECT:Maths
----------------------------
*/

