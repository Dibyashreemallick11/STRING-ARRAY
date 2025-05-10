package Com.StringProgramPratice;

import java.util.Scanner;

public class CountWordsString {
	public static void main(String[] args) {
		//1.approach
		System.out.println("Enter the String:");
		Scanner sc=new  Scanner(System.in);
		String s=sc.nextLine();//welcome to java
		int count = 1;
		for(int i=0;i<s.length()-1;i++) {
			if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count ++;
			}
		}
		System.out.println("Number of words in a string:"+count);
		
		// 2.Another approach
	 String str="hello welcome to java programming";
		String[] tokens=str.split(" ");
		System.out.println(tokens.length);
		
		//3.Approach
		int countt =1;
		String s2="java is easy";
		for(int i=0;i<s2.length();i++) {
			if((s2.charAt(i)==' ')) {
				count ++;
			}
		}
		System.out.println("number of words in string="+countt);
		
		
		
	}
	
	
	

} 
