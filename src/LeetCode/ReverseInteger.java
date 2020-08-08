package LeetCode;

import java.util.LinkedList;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = -123456;
		int number = Math.abs(number1);
		String finalValue = null;
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (number > 0) {
		    stack.push( number % 10 );
		    number = number / 10;
		}
		for(int i=stack.size()-1;i>=0;i--) {
			if(i==stack.size()-1) {

				finalValue = stack.peekLast().toString();		
			} else {
			finalValue = finalValue.concat(stack.get(i).toString());
			}
		}
		
		if(number1 > 0) {
		System.out.println(Integer.parseInt(finalValue));
		} else {
		
			System.out.println(Math.negateExact(Integer.parseInt(finalValue)));
		}
	}
	

}

