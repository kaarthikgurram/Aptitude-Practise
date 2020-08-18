package test;

public class CountNumber1 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 14;
		String c = Integer.toString(a);
		int count = 0;
		for(int i=0;i<=b;i++) {
			String d = Integer.toString(i);
			if(d.contains(c)) {
				
				String[] g = d.split("");
				int k = g.length;
				for(int j=0;j<=k-1;j++) {
					if(g[j].contains(c)) {
						count++;
					}
				}
				}
	}
		System.out.println(count);
}

}
