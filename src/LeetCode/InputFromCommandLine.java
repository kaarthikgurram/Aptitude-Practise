package LeetCode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFromCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter to display back in console: ");
		int s1 = s.nextInt();
		
		try {
		// works only for Int
		System.out.println(s1);
		} catch(InputMismatchException ex) {
			System.out.println("Please enter valid data, this accepts only Integer values");
			//ex.printStackTrace();
		}

	}

}
