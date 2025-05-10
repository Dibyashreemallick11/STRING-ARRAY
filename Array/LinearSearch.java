package Com.Array;

public class LinearSearch {
	public static void main(String[] args) {
		int [] a= {2,3,5,6,7,1,8,10,9};
		System.out.println(search(a,6));
		System.out.println(search(a,12));
				
		
	}
	static int search(int[]a,int e) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) {
				return i;
			}
		}
		return -1;
		
	}

}
