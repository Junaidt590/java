/**1. Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations*/

import java.util.*;

class Arraylist{
	
	public static void main(String args[]){
		
		//create an arraylist
		ArrayList<String> AL=new ArrayList<String>();
		System.out.println("Initial state of AL: "+AL.size());
		
		//add elements to the arraylist
		AL.add("Adhil");
		AL.add("Ashiq");
		AL.add("Abiram");
		AL.add("Aron");
		AL.add("Marshal");

		System.out.println("Contents of AL: "+AL);
		System.out.println("\nAbin addes 2nd index position\n");
		AL.add(2,"Abin");
		System.out.println("Contents of AL: "+AL);
		System.out.println("\nArray size after addition: "+AL.size());
		
		AL.remove("Marshal");
		System.out.println("Contents after removed Marshal: "+AL);
		String s=AL.get(0);
		AL.remove(0);
		System.out.println("Contents after removed " +s+ " in AL: "+AL);
		}
}

/**
OUTPUT
------
Initial state of AL: 0
Contents of AL: [Adhil, Ashiq, Abiram, Aron, Marshal]

Abin addes 2nd index position

Contents of AL: [Adhil, Ashiq, Abin, Abiram, Aron, Marshal]

Array size after addition: 6
Contents after removed Marshal: [Adhil, Ashiq, Abin, Abiram, Aron]
Contents after removed Adhil in AL: [Ashiq, Abin, Abiram, Aron]

*/
