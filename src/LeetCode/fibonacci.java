package test;

public class fibonacci {

	public static void main(String[] args) {
		
		int x = 20,y = 0,z = 1;

		for (int i = 0; i <= x; i++) {
			
			System.out.println(y);
			
			int sum = y + z;
			y=z;
			z= sum;
			
			
		}
		
		
	}

}
