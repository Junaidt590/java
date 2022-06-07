/*4. Program to demonstrate the creation of queue object using the
PriorityQueue class*/
import java.util.*;

class pque {
	public static void main(String args[]){
		PriorityQueue<String>pq =new PriorityQueue<String>();
		pq.add("Abin");
		pq.add("Anand");
		pq.add("Jithu");
		pq.add("midhun");
		pq.add("Aswin");
		pq.add("Scisna");
		System.out.println("contents in pq"+pq);

		Iterator<String> itr=pq.iterator();


		System.out.println("\nusing itrator print elements in queue \n");
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}		
		System.out.println();
	}

}

/**
OUTPUT
------
contents in pq[Abin, Anand, Jithu, midhun, Aswin, Scisna]

using itrator print elements in queue 

Abin	Anand	Jithu	midhun	Aswin	Scisna	
*/
