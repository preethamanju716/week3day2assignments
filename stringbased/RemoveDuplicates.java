package week3.day2.assignments.stringbased;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String temp="";
		
		String[] s=text.split(" ");
		for(int i=0;i<=s.length-1;i++) {
			for(int j=s.length-1;j>=0;j--) {
				if(i!=j && s[i].equalsIgnoreCase(s[j])) {
					count=count+1;
					temp=s[i];	
				}
			}
		}
		if(count>1) {
			String t=text.replace(temp,"");
		System.out.println(t);
		}


	}

}
