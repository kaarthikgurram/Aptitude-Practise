package synopsys.code.test;

import java.util.*;

public class AmazonCodeTest1 {

	{
	    Stack<Integer> scores = new Stack<Integer>();
	    
	    scores.add(5);
	    scores.add(-2);
	    scores.add(4);
	    scores.add("Z");
	    scores.add("X");
	    scores.add(9);
	    scores.add(+);
	    scores.add(+);
	}
	    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	    public int totalScore(int num, List<String> blocks)
	    {
		
	        // WRITE YOUR CODE HERE
	       
	        scores.push(0);
	        
	        //int lastScore = 0;
	        for (String b : blocks) {
	           getScore(b);
	           
	        }

	        int out = 0;
	        for (int i : scores) {
	            out = out + i;
	            
	        }
	        
	        return out;
	        
	    }
	    // METHOD SIGNATURE ENDS
	    // 5 -2 -4 9 5 14
	    public void getScore(String b) {
	        if (isNumeric(b)) {
	           scores.push(Integer.valueOf(b));
	        }
	        
	        if (b.equals("X")) {
	            
	            if (scores.empty()) {
	                scores.push(0);
	                return;
	            }
	            
	            int val =  2 * scores.peek();
	            scores.push(val);
	        }
	        
	        if (b.equals("+")) {
	            int s = 0;
	            
	            if (scores.empty()) {
	                return;
	            }
	            
	            int top = scores.pop();
	            s= s + top;
	            
	            if (!scores.empty()) {
	                s = s + scores.peek();
	            }
	            
	            scores.push(top);
	            scores.push(s);
	            
	           // return s;
	        }
	        
	        if (b.equals("Z")) {
	            if (scores.empty()){
	                return ;
	            }
	                scores.pop();
	           // return 0;
	        }
	        
	       // return 0;
	    }
	    
	    public  boolean isNumeric(String str) { 
	         try {  
	                     Double.parseDouble(str);  
	                     return true;
	        } catch(NumberFormatException e){  
	        return false;  
	    }  
	}
}
