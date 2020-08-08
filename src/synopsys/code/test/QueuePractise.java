package synopsys.code.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractise {

	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(10);
		que.add(11);
		que.peek();
		System.out.println(que);
		
	}

}
