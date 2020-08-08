package LeetCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static void main(String args[] ) throws Exception {

    	String s = "abcbdefcd";
    	String s1 = s.substring(0, Math.min(s.length(), 10));
    	
    	String[] t ={"ab", "abc", "def", "cd", "abcd", "saf", " " }; 
    	
    	for(String i : t){
    		//System.out.println(i);
    		if(s.contains(i) && i !=null) {
    			System.out.println("true");
    		} else {
    			System.out.println("false");
    		}
    	}
}
}