package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntegerToRoman {


	static HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter valid Integer value to return its roman value:");
//		
//		int x = s.nextInt();
//		
//		String k = Integer.toString(x);
//		
//		//System.out.println(k);
//		
//		
//		String[] a = k.split("");
//		for(String i : a )
//		System.out.println(i);
		
		int x = 555;
		int number = Math.abs(x);
		
		hmap.put(1, "I");
		hmap.put(4,  "IV");
		hmap.put(5, "V");
		hmap.put(6, "VI");
		hmap.put(9, "IX");
		hmap.put(10, "X");
		hmap.put(40, "XL");
		hmap.put(50, "L");
		hmap.put(60, "X");
		hmap.put(100, "C");
		hmap.put(400, "CD");
		hmap.put(500, "D");
		hmap.put(600, "DC");
		hmap.put(1000, "M");
		
		
		HashMap<Integer, Integer> v = new HashMap<Integer, Integer>();
		
		v.put(0, 1);
		v.put(1, 10);
		v.put(2, 100);
		v.put(3, 1000);

		ArrayList<Integer> stack = new ArrayList<Integer>();
		while (number > 0) {
		    stack.add( number % 10 );
		    number = number / 10;
		}
		for(int i= stack.size()-1;i>=0;i--){
			int decimalPosition = v.get(i);
			int decimalValue = stack.get(i);
			String romanValue = getValue(decimalPosition, decimalValue);
			
			for(int j= decimalValue; j>0; j--){
			if(decimalValue == 5 && decimalPosition == 1) {
				System.out.print("V");
				break;
			} else if (decimalValue == 5 && decimalPosition == 10) {
				System.out.print("L");
				break;
			} else if (decimalValue == 5 && decimalPosition == 100) {
				System.out.print("D"); 
				break;
			} else {
			}
			System.out.print(romanValue);
			}
			//romanValue = romanValue.concat(romanValue);
			}
			
			
			
			
			
			
//		System.out.println(stack.get(i) + "*" + decimalPosition + ":" + 
//			stack.get(i) + "-->" + romanValue );
		}
		
		
////		for(Map.Entry<String, Integer> entry : hmap.entrySet() ) {
////			System.out.println(entry.getKey() + " " + entry.getValue());
////		}
//		
//		System.out.println(getValue("I"));
//	}
//	

		public static String getValue(int decimalPosition, int decimalValue) {
			
			return hmap.get(Math.multiplyExact(decimalPosition, decimalValue));
			
	}

}
