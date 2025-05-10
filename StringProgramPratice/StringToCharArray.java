package Com.StringProgramPratice;

public class StringToCharArray {
	public static void main(String[] args) {
	/*	String s="java program";
     mylogic(s);
	}
		
		static void mylogic(String s) {
			
		char [] mychar=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			mychar[i]=s.charAt(i);
			
		}
		for(int i=0;i<mychar.length;i++) {
			System.out.println(mychar[i]);
		}*/
		
		String str="Hello world";
		char []charArray=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			charArray[i]=str.charAt(i);
		}
		System.out.println(charArray);
		
		
	}
}

