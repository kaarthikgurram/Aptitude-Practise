package synopsys.code.test;

import java.util.ArrayList;

public class Palindrome {

	public static void main(String[] args) {
		int i;
		String s = "laddu";
		String[] s1 =s.split("");
		for(i = s1.length -1; i>=0; i--) {
			ArrayList<String> s2 = new ArrayList<String>();
			s2.add(s1[i]);
			System.out.println(s2);
		}
		}

}
