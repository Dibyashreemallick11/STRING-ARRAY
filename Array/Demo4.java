package Com.Array;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		
		Circle[] a=new Circle[4];
		a[0]=new Circle(50);
		a[1]=new Circle(20);
		a[2]=new Circle(70);
		a[3]=new Circle(40);
		for(Circle c: a) {
			System.out.println(c);
		}
		System.out.println(Arrays.toString(a));

			}

	}


