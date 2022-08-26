package week3.day2.assignments.stringbased;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
	  
	 String test = "changeme";
	 
	 char[] c=test.toCharArray();
	 
	 for(int i=0;i<=c.length-1;i++) {
		 if(i%2!=0) {
			 String temp=c[i]+"";
			 String s=temp.toUpperCase();
			 System.out.print(s);
		 }
		 else
			 System.out.print(c[i]);
	 }

}
}