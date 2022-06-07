/**
2.Program to remove all the elements from a linked list */

import java.util.*;

class Linkedlist{

	public static void main(String args[]){

		LinkedList<String> Ll=new LinkedList<String>();

		Ll.add("BMW");
		Ll.add("VOLVO");
		Ll.add("MAZDA");
		Ll.add("FORD");
		Ll.add("BENZ");
		Ll.addLast("PORCHE");
		Ll.addFirst("MINI");
		System.out.println("size of Ll before deletion: " + Ll.size());
		System.out.println("Contents of Ll before deletion: " + Ll);
		
		Ll.removeFirst();
		Ll.removeLast();	
		System.out.println("Contents of Ll remove first and last element : " + Ll);


		//Ll.removeAll(Ll);
		Ll.clear();
		
		System.out.println("Contents of Ll after deletion: " + Ll);


}
}

/**
OUTPUT
------
size of Ll before deletion: 7
Contents of Ll before deletion: [MINI, BMW, VOLVO, MAZDA, FORD, BENZ, PORCHE]
Contents of Ll remove first and last element : [BMW, VOLVO, MAZDA, FORD, BENZ]
Contents of Ll after deletion: []
*/
