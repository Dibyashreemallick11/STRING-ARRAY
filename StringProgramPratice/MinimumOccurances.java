package Com.StringProgramPratice;

import java.util.Scanner;

public class MinimumOccurances {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		occurances(s);
	
	}
		
		static void occurances(String s) {
		int min=s.length();
		char c=s.charAt(0);
		while(s.length()>0) {
			String temp="";
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(0)==s.charAt(i)) {
					count++;
				}
				else temp+=s.charAt(i);
			}
			if(count<min) {
				min=count;
				c=s.charAt(0);
			}
			s=temp;
	
		}
		System.out.println(c+"="+min);
		}

	}


