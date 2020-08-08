package synopsys.code.test;

public class fibonacciSeries {

	public static void main(String[] args) {
		int j = 0;
		int k =1;
		int l = 20;
		System.out.println(j);
		System.out.println(k);
		
		for(int i=0;l<=20;i++) {
			l = j + k;
			j=k;
			k=l;
			System.out.println(l);
		}

	}

}
