package test;

import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CountNumbers {
	
	
    public static void main(String args[] ) throws Exception {
    	  String inputData = "";
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData += thisLine + "\n";
        }
        // Output the solution to the console
        System.out.println(calculateFreq(inputData));
    }
    
    public static int calculateFreq(String inputData) {
        // Use this function to write your solution;
        String[] rangeArr = inputData.split("\n");
        int digitInt = Integer.parseInt(rangeArr[0]);
        int rangeInt = Integer.parseInt(rangeArr[1]);
        String digit = Integer.toString(digitInt);
		int count =0;


        for(int i=0;i<=rangeInt;i++){
        	String rangeString = Integer.toString(i);
        	if(rangeString.contains(digit))  {
        		String[] splitRange = rangeString.split("");
        		for(int j=0;j<=splitRange.length-1;j++) {
        			if(splitRange[j].contains(digit)) {
        				count++;
        			}
        		}
        	}
        }

        return count;
    }


}