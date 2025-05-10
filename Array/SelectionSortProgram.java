package Com.Array;

import java.util.Arrays;

public class SelectionSortProgram {
	public static void main(String[] args) {
		int [] a= {3,2,5,7,5,9};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	static void  sort (int [] a) {
		for(int i=0;i<a.length-1;i++) {
			int minmax=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<  a [minmax])  minmax=j; 
				
			}
			int temp=a[minmax];
			a[minmax]=a[i];
			a[i]=temp;
		
		}
	}

	}


