package Com.StringProgramPratice;

public class SumOfNumberString {
	public static void main(String[] args) {
		int sum=0;
		String s="ash123";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				sum+=(ch-'0');
				
			}
		}
		System.out.println(sum);
	}

}
