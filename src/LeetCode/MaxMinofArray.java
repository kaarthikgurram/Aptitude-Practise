package test;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,1,3,4,2,7,6,10};
		
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println(max);
		
		int min = Arrays.stream(a).min().getAsInt();
		
		System.out.println(min);
	}

}
