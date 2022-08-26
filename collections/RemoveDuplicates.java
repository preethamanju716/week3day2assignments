package week3.day2.assignments.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="PayPalIndia";
		
		char[] c=s.toCharArray();
		
		Set<Character> newset=new HashSet<Character>();
		
		for(Character data:c) {
			if(data!=' ') {
			newset.add(data);
			}
		}
		
		System.out.println(newset);
		
		
	}
	}
