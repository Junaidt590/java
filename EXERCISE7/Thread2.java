/**Define 2 classes; one for generating Fibonacci
numbers and other for displaying even numbers in a
given range. Implement using threads. (Runnable
Interface)*/

import java.util.*;

class Fibonacci implements Runnable{
		int n;
		Fibonacci(int a){
			this.n=a;
		}

		public void run(){
			int a=0,b=1;
			try{
			    if(n==1){
				System.out.println("Fibonacci series \n -->0");
				}
				else{
				     int f=0;
				     System.out.println("fibonacci -->0\nfibonacci -->1");
				     while(0<n-2){
					f=a+b;
					a=b;
					b=f;
					System.out.println("fibonacci -->"+f);
					n--;
					Thread.sleep(1000);
					}
				
			}
				
		

	}
	catch(Exception e){
		System.out.println("Something wrong...");
		}
	}
}
class Even implements Runnable{
		int e;
		Even(int a){
			this.e=a;
			}
			public void run(){
				
				try{for(int i=1;i<=e;i++){
					if(i%2==0){
						System.out.println("Even number -->"+i);
						Thread.sleep(1000);
						}
					
				}
				
		}
		catch(Exception e){
		System.out.println("Something wrong...");
		}
	}
}
class Thread2{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int u=sc.nextInt();
			
			Fibonacci f=new Fibonacci(u);
			Thread th=new Thread(f);

			Even e=new Even(2*u);
			Thread th1 = new Thread(e);
		th1.start();
		th.start();
		}
	
}

/**
OUTPUT
------

Enter a number: 
10
fibonacci -->0
fibonacci -->1
fibonacci -->1
Even number -->2
Even number -->4
fibonacci -->2
Even number -->6
fibonacci -->3
Even number -->8
fibonacci -->5
Even number -->10
fibonacci -->8
Even number -->12
fibonacci -->13
Even number -->14
fibonacci -->21
Even number -->16
fibonacci -->34
Even number -->18
Even number -->20
*/



