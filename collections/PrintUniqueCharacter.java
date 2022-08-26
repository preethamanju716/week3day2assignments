package week3.day2.assignments.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String str="Preetha";
		for (int i = 0; i < str.length(); i++)
	    {
	        int flag = 0;
	        for (int j = 0; j < str.length(); j++)
	        {
	            // checking if two characters are equal
	            if (str.charAt(i) == str.charAt(j) && i != j)
	            {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0)
	            System.out.print(str.charAt(i));
	    }
	}
}
		

		