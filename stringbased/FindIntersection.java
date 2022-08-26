package week3.day2.assignments.stringbased;

import java.lang.reflect.Array;

public class FindIntersection {
	public static void main(String[] args) {
		String[] a={"apple","orange","pine","banana"};
		String[] b={"orange","guava","Pine","apple"};
		
		System.out.print("{");
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=b.length-1;j++) {
				if(a[i].equalsIgnoreCase(b[j])) 
					System.out.print(a[i]+",");
				}
			}
		System.out.println("}");
		}
	
}


