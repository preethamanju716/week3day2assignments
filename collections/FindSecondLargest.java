package week3.day2.assignments.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				TreeSet<Integer> newset=new TreeSet<Integer>();
				
				for(int i=0;i<data.length;i++) {
					newset.add(data[i]);
					
				}
				ArrayList<Integer> list1=new ArrayList<Integer>(newset);
				System.out.println(list1.get(1)+ " is the second largest element");

	}

}
