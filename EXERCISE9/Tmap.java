/**
2. Program to Convert HashMap to TreeMap
*/

import java.util.*;
public class Tmap {
	public static void main(String args[]){
		HashMap<String,Double>hm =new HashMap<String,Double>();
		
		//HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("book",50.0);
		hm.put("pen",15.5);
		hm.put("pencil",5.6);
		hm.put("box",100.5);
		hm.put("umberla",200.8);
		hm.put("bag",680.0);
		System.out.println("Hashmap: "+hm+"\n");				
		
		TreeMap<String,Double> tm =new TreeMap<>();
		tm.putAll(hm);
		System.out.println("Treemap: "+tm+"\n");				
	}
}


/**
OUTPUT
------
Hashmap: {umberla=200.8, book=50.0, pen=15.5, bag=680.0, box=100.5, pencil=5.6}

Treemap: {bag=680.0, book=50.0, box=100.5, pen=15.5, pencil=5.6, umberla=200.8}


*/
