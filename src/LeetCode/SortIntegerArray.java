package test;

import java.util.*;

public class SortIntegerArray {
	
	public static void main(String args[]) {
	
	SortIntegerArray rs = new SortIntegerArray();
	
	rs.solution();
	}
	
	public int solution() {
		
		int[] a = {5,1,3,4,2,7,6,10};
		int abc = 10;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				
				if(a[j] > a[j+1]) {
					int x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
				}
				}
	}
		System.out.println(Arrays.toString(a));
		return abc;
	}
	

}