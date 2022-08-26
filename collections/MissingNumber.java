	package week3.day2.assignments.collections;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

			int[] data= {1,2,3,4,5,6,8,9,10};
			int temp = 0;
			TreeSet<Integer> newset=new TreeSet<Integer>();
			
			for(int i=0;i<data.length;i++) {
				newset.add(data[i]);
				
			}
			ArrayList<Integer> list1=new ArrayList<Integer>(newset);
			for(int i=0;i<=list1.size()-1;i++) {
				for(int j=i+1;j<list1.size()-2;j++) {
					if((list1.get(i)+1)!=list1.get(j)) {
						temp=list1.get(i)+1;
						
					}
					
				}
			}
			System.out.println(temp+" is the missing number");
	}
}
			
			
			
		 /* Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */

	


