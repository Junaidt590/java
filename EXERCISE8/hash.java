/*7. Write a Java program to compare two hash set*/
import java.util.*;
public class hash {
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("Orange");
		set.add("Pink");
		
		System.out.println(set);
		HashSet<String> set2=new HashSet<String>();
		set2.add("Red");
		set2.add("Pink");
		set2.add("Black");
		set2.add("Orange");
		System.out.println(set2);
		
		for (String element : set){		
		
		System.out.print(set2.contains(element) ? "Both HashSet contain ": "Both HashSet not contain " );
		System.out.println(element);
		}
	}
}

/**
OUTPUT
------
[Red, Pink, Black, Orange, Green]
[Red, Pink, Black, Orange]
Both HashSet contain Red
Both HashSet contain Pink
Both HashSet contain Black
Both HashSet contain Orange
Both HashSet not contain Green
*/
