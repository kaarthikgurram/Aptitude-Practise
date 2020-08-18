package test;

public class findDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,1,1,4,2,7,6,10};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				int b = a[i];
				int c = a[j + 1];
				if(b == c) {
					System.out.println(a[i]);
				}
			}
		}

		
	}

}
