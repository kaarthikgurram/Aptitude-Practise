package test;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "MSSLS";
		String[] b = a.split("");
		String temp;
		
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		
	       for (int i = 0; i < b.length; i++) 
	        {
	            for (int j = i + 1; j < b.length; j++) { 
	                if (b[i].compareTo(b[j])>0) 
	                {
	                    temp = b[i];
	                    b[i] = b[j];
	                    b[j] = temp;
	                }
	            }
	        }
	        for (int i = b.length - 1; i >= 0; i--) 
	        {
	        	String k = b[i];
	        	System.out.println(k);
	        }
	        
	}
}
