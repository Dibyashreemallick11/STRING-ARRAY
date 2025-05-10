package Com.Array;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		System.out.println("a="+Arrays.toString(a));
		int[] b= new int [4];
		System.out.println("b="+Arrays.toString(b));
		System.arraycopy(a, 0, b, 0, 4);
		System.out.println("b="+Arrays.toString(b));


		
		
	}

}
