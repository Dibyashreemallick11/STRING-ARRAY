package Com.StringProgramPratice;

public class ArrangeCharString {
	public static void main(String[] args) {
		String s="ram#123";
		System.out.println(aaraytochar(s));
		
	}
	static String aaraytochar(String s) {
		String alpha="";
		String num="";
		String other="";
		for(char c:s.toCharArray()) {
			if((c>='a'&& c<='z') ||(c>='A' && c<='z')) {
				alpha+=c;
			}
			else if(c>='0' && c<='9') {
				num+=c;
			}
			else {
				other+=c;
			}
		}
	
		return num+other+alpha;
		
		
		
		
		
	}

}
