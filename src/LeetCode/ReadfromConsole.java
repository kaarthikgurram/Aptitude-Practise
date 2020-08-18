package test;

import java.io.*;

class ReadfromConsole {

	public static void main(String[] args) throws Exception {

    String inputData = "";
    String thisLine = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while ((thisLine = br.readLine()) != null) {
        inputData += thisLine + "\n";
    }
    // Output the solution to the console
    System.out.println(thisLine);
	}

}
