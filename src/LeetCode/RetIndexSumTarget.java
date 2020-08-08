package LeetCode;

import java.util.List;
import java.util.Vector;

public class RetIndexSumTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Vector indexes = new Vector();
		Vector list  = new Vector();
		
		list.add(2);
		list.add(11);
		list.add(7);
		list.add(3);
		list.add(15);
		list.add(6);
		for(int i=0;i<list.size();i++) {
			int first = (Integer) list.get(i);
			List<Integer> subList = list.subList(i+1, list.size());
			for(int j: subList) {
				if(Integer.sum(first, j) == 9) {
				indexes.add(i);
				indexes.add(list.indexOf(j));

				System.out.println(indexes);
				indexes.clear();
				}
			}
		}

		
	}

}
