package LeetCode;

import java.util.LinkedList;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = -121121;
		int x = Math.abs(y);
		String finalValue = null;
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (x > 0) {
		    stack.push( x % 10 );
		    x = x / 10;
		}
		
		for(int i=stack.size()-1;i>=0;i--) {
			if(i==stack.size()-1) {
				finalValue = stack.peekLast().toString();
				} else {
					finalValue = finalValue.concat(stack.get(i).toString());
					}
			}
		if(Integer.parseInt(finalValue) == y) {
			System.out.println("Its a palindrome");
		} else {
			System.out.println("Its not a palindrome");
		}
	}
}
