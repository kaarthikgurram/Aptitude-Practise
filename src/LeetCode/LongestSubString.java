package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		String finalString = null;
		String s = "abcabcbb";
		
		ArrayList<String> s2 = new ArrayList<String>();
		
		String[] s1 = s.split("");
		
		for(String i : s1) {
			s2.add(i);
		}
		for(int j=0;j< s2.size()-1;j++){
			finalString = s2.get(j);
			List<String> subli = s2.subList(j+1, s2.size());
			while(subli.contains(finalString)) {
				finalString = finalString.concat(s2.get(j+1));
				j=j+1;
	} 
} //System.out.println(finalString);
}
}