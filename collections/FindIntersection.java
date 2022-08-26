package week3.day2.assignments.collections;

import java.awt.List;
import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {
		
		 int[] a={3,2,11,4,6,7};
		 int[] b={1,2,8,4,9,7};
		 
		 ArrayList<Integer> list1=new ArrayList<Integer>();
		 ArrayList<Integer> list2=new ArrayList<Integer>();
		 
		 for(int i=0;i<=a.length-1;i++) {
			 list1.add(a[i]);
		 }
		 
		 for(int i=0;i<=b.length-1;i++) {
			 list2.add(b[i]);
		 }
		 
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<b.length;j++) {
				 if(a[i]==b[j]) {
					 System.out.println(a[i]);
				 }
			 }
		 }
		 System.out.println("are the common elements");

	}

}
