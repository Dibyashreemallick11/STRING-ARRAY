package Com.StringProgramPratice;

public class CharArrayToString {
public static void main(String[] args) {
	//1st Approach
	char [] charArray= {'H','E','L','L','O','W','O','R','L','D'};
	String str=new String(charArray);
	System.out.println(str);
	//2nd Approach
	String s2=String.valueOf(charArray);
	System.out.println(s2);
	//3rd Approach
	StringBuilder s3=new StringBuilder();
	s3.append(charArray);
	System.out.println(s3);
	
}
}
