package synopsys.code.test;

public class noOfVowelsinWord {

	public static void main(String[] args) {
		String s = "lucky";
		String[] s2 = s.split("");
		String[] s1 = {"a","e", "i", "o", "u"};
		for(int i=0;i<=s.length() -1;i++) {
			for(int j=0; j <=s1.length-1;j++) {
			if(s2[i].equalsIgnoreCase(s1[j])) {
			System.out.println(s2[i]);
			}
			}
		}
	}

}
