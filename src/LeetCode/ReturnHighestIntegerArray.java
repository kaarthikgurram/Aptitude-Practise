package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReturnHighestIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = {1,4,5,3,6,8,11,24};
		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(4);
//		System.out.println(Arrays.toString(arr.toArray()));
		
		//{1,3,4,5,6,8,11,24}
		
		Arrays.sort(a);
		int b = a[0];
		int c = Collections.max(Arrays.asList(a));
		
		for(int i=0;i<=c-1;i++) {
			for(int j=0;j<a.length;j++) {
				int d = a[j];
			if(b==d) {
				b = b+1;
			} else {
				arr.add(b);
			}

	}

		}
	}
}