/**2. Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and methods to display the data members. Use array of objects to display details of N teachers.*/

import java.util.*;
class Person{
	String Name;
	String Gender;
	String Address;
	int Age;
	Person(String name,String gen,String add,int ag){
	Name=name;
	Gender=gen;
	Address=add;
	Age=ag;
	}
}
class Employee extends Person{
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;

	Employee(String name,String gen,String add,int ag,int id,String comp,String quali,double sal){
	super(name,gen,add,ag);

	Empid=id;
	Company_name=comp;
	Qualification=quali;
	Salary=sal;

	}
}
class Teacher extends Employee{
	String Subject;
	String Department;
	int Teacherid;

	Teacher(String name,String gen,String add,int ag,int id,String comp,String quali,double sal,String sub,String dept,int tid){

	super(name,gen,add,ag,id,comp,quali,sal);
	Subject=sub;
	Department=dept;
	Teacherid=tid;

	}
void Display(int i){
	System.out.println("EMPID:"+Empid+"\nNAME:"+Name+"\nCompany_Name:"+Company_name+"\nQualificatin:"+Qualification+"\nSALARY:"+Salary+"\nADDRESS:"+Address+"\nGender:"+Gender+"\nAge:"+Age);
	System.out.println("TeacherId:"+Teacherid+"\nDEPARTMENT:"+Department+"\nSUBJECT:"+Subject);
	System.out.println("----------------------------");
	      }
}
	class Main{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of teachers: ");
		int n=sc.nextInt();
		Teacher obj[]=new Teacher[n];
		
		for(int i=0;i<n;i++){
			
			

			System.out.println("Enter Employee Name: ");
			String name=sc.next();
			
			System.out.println("Enter Gender: ");
			String gen=sc.next();

			System.out.println("Enter Employee Address: ");
			String add=sc.next();

			System.out.println("Enter Age: ");
			int ag=sc.nextInt();

			System.out.println("Enter Empid: ");
			int id=sc.nextInt();

			System.out.println("Enter Company Name: ");
			String comp=sc.next();

			System.out.println("Enter Qualification: ");
			String quali=sc.next();

			System.out.println("Enter Employee Salary: ");
			double sal=sc.nextDouble();

			System.out.println("Enter Department: ");
			String dept=sc.next();

			System.out.println("Enter subject: ");
			String sub=sc.next();

			System.out.println("Enter TeacherId: ");
			int tid=sc.nextInt();

			

			obj[i]=new Teacher(name,gen,add,ag,id,comp,quali,sal,sub,dept,tid);
		
			System.out.println("--------------------\n");
			}
			for(int i=0;i<n;i++){
				
				obj[i].Display(i);
		}
	}
}
/**
OUTPUT
------
Enter the no of teachers: 
2
Enter Employee Name: 
Abirag
Enter Gender: 
male
Enter Employee Address: 
calicut
Enter Age: 
30
Enter Empid: 
10001
Enter Company Name: 
TCS
Enter Qualification: 
Phd   
Enter Employee Salary: 
65000
Enter Department: 
cs
Enter subject: 
c++
Enter TeacherId: 
101
--------------------

Enter Employee Name: 
Yethu
Enter Gender: 
male
Enter Employee Address: 
TSR
Enter Age: 
31
Enter Empid: 
10003
Enter Company Name: 
wipro
Enter Qualification: 
Phd  
Enter Employee Salary: 
75000
Enter Department: 
cs
Enter subject: 
python
Enter TeacherId: 
106
--------------------

EMPID:10001
NAME:Abirag
Company_Name:TCS
Qualificatin:Phd
SALARY:65000.0
ADDRESS:calicut
Gender:male
Age:30
TeacherId:101
DEPARTMENT:cs
SUBJECT:c++
----------------------------
EMPID:10003
NAME:Yethu
Company_Name:wipro
Qualificatin:Phd
SALARY:75000.0
ADDRESS:TSR
Gender:male
Age:31
TeacherId:106
DEPARTMENT:cs
SUBJECT:python
----------------------------


*/
