/* Program to demonstrate the addition and deletion of elements in deque*/

import java.util.*;
public class deque {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		//add elements
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		dq.add(5);
		dq.add(6);
		System.out.println("after inserting elements : ");
		for (int i : dq) {
			System.out.print(i+"\t");
		}
		//remove using pop 
		dq.pop();
		System.out.println("\nAfter popping  elements in deque: ");
		for (int i : dq) {
			System.out.print(i+"\t");
		}
		//remove 3
		dq.remove(3);	
		System.out.println("\n element 3 removed :"+dq);
	}

}

/**
OUTPUT
------
after inserting elements : 
1	2	3	4	5	6	
After popping  elements in deque: 
2	3	4	5	6	
 element 3 removed :[2, 4, 5, 6]
*/
