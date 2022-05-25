/**3. Define 2 classes; one for generating multiplication
table of 5 and other for displaying first N prime numbers.
Implement using threads. (Thread class) */

import java.util.*;

class Mult extends Thread{
	
	public void run(){
		super.run();
	
		try{
			for(int i=1;i<11;i++){
			
			System.out.println(i+" * 5 = "+(5*i)+"\n");
			Thread.sleep(1000);
			
			}
		}
		catch(Exception e){
			System.out.println("Thread interepted");
			}

		}
	}
class Prime extends Thread{

	int p;
	Prime(int p){
		this.p=p;

		}
		public void run(){
			super.run();
			
			boolean x;
			try{
			    for(int i=2;i<p;i++){
					x=true;

				for(int j=2;j<=i/2;j++){
							
					if(i%j==0){
						x=false;
						
					}
				}
				if(x){
				System.out.println("prime - "+i+"\n");
				}
				
			Thread.sleep(1000);
									
			}
		
		
	
		}
		catch(Exception e){
			System.out.println("thread interepted");
		
		}
	}

}



class Thread1{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number for limit of prime");
		int n=sc.nextInt();
		
		Mult m = new Mult();
		Prime p= new Prime(n);
		p.start();
		m.start();
		
		
		
		
		
	}


}

/**
OUTPUT
------
Enter a number for limit of prime
10
prime - 2

1 * 5 = 5

prime - 3

2 * 5 = 10

3 * 5 = 15

prime - 5

4 * 5 = 20

5 * 5 = 25

prime - 7

6 * 5 = 30

7 * 5 = 35

8 * 5 = 40

9 * 5 = 45

10 * 5 = 50

*/




