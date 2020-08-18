package test;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution1 sol = new Solution1();
		String S = "We test coders. Give us a try?";
		sol.solution1(S);

	}
	
    public int solution1(String S) {
        // write your code in Java SE 8

		String[] arr = S.split("\\?|\\.|\\!");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			String[] arr1 = arr[i].split("\\ ");
			System.out.println(Arrays.toString(arr1));

			for(int j=0;j<arr1.length;j++) {
				int adsf = arr1[j].length();
 				System.out.println(adsf);
 				
			}
    }
    	int f = 4;
    	return f;  }

}
