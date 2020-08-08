package LeetCode;

import java.util.HashMap;

public class PractiseClass {
	

	static HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		hmap.put(1, "I");
		hmap.put(4,  "IV");
		hmap.put(5, "V");
		hmap.put(6, "VI");
		hmap.put(10, "X");
		hmap.put(40, "XL");
		hmap.put(50, "L");
		hmap.put(60, "XL");
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
		
		
		System.out.println(getValue(10, 7));
		//getValue(10, 4);
		

	}
	
	public static String getValue(int decimalPosition, int decimalValue) {

		int k = Math.multiplyExact(decimalValue, decimalPosition);
		//System.out.println(k);
		return hmap.get(k);
		
}

}
