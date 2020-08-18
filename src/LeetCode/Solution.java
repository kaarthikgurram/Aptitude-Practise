//
//package test;
//
//// you can also use imports, for example:
//// import java.util.*;
//
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
//class Solution {
//    public String solution(String T) {
//        // write your code in Java SE 8
//        String[] b = T.split("");
//        String temp;
//        String resp = "";
//        	       for (int i = 0; i < b.length; i++) 
//	        {
//	            for (int j = i + 1; j < b.length; j++) { 
//	                if (b[i].compareTo(b[j])>0) 
//	                {
//	                    temp = b[i];
//	                    b[i] = b[j];
//	                    b[j] = temp;
//	                }
//	            }
//	        }
//	        for (int i = b.length - 1; i >= 0; i--) 
//	        {
//	            resp = b[i];
//	        }
//        System.out.print(resp);
//        return resp;
//        }
//    public static void main(String args[]) {
//        Solution sol = new Solution();
//        String f = "MSSLS";
//        sol.solution();
//        
//    }
//
//}