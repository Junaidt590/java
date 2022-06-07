/*6. Program to demonstrate the creation of Set object using the
LinkedHashset class*/
import java.util.*;
public class linkedHash {
	public static void main(String[] args) {
		LinkedHashSet <String> HS = new LinkedHashSet<String>();
		HS.add("java");
		HS.add("python");
		HS.add("c");
		HS.add("c++");
		HS.add("js");
		HS.add("datastructure");
		System.out.println("Set = "+HS);

		Iterator<String> itr = HS.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
}
}


/**
OUTPUT
------
Set = [java, python, c, c++, js, datastructure]
java	python	c	c++	js	datastructure	
*/s
