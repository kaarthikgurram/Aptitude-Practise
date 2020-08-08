package synopsys.code.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("karthik");
		list1.add("gurram");
		list1.add("sahithi");
		list1.add("parepally");
		list1.add("lucky");
		list1.add("ramu");
		
		ArrayList list2 = new ArrayList();
		
		list2.add(10);
		list2.add('A');
		list2.add(10);
		list2.add(2.2);
		list2.add(list1);
		
//		System.out.println(list1);
//		System.out.println(list2);
		
		for(String str: list1) {

			System.out.println(str);
			
		}
		
//		for(int j=0;j<s1.length;j++) {
//			System.out.println(Array.get(s1, j));
//		}
	}

}
