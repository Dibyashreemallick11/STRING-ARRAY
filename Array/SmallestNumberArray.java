package Com.Array;

public class SmallestNumberArray {
	public static void main(String[] args) {
		int [] a= {9,6,5,7,8,3};
		int smallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest)
			{
			smallest=a[i];	
			}
		}
		
		System.out.println(smallest);
	}
             
}
