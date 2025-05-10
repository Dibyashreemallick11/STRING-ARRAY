package Com.Array;

public class SecondSmallestProgram {
	public static void main(String[] args) {
		int[]a= {3,4,6,7,2,9};
		int smallest=a[0];
		int secondsmallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==smallest) continue;
			if(a[i]<smallest) {
				secondsmallest=smallest;
				smallest=a[i];
			}
			else if(a[i]<secondsmallest || smallest == secondsmallest ){
				secondsmallest=a[i];
				
				
			}
		}
		System.out.println(secondsmallest);
	}

}
