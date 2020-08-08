package synopsys.code.test;

import java.util.ArrayList;

public class codeTest {
	

	public static void main(String[] args) {
		
		String newLine = System.getProperty("line.separator");
		String s = "20181115 15:01:01 - Doing something" + newLine +
"20181115 15:01:01 - Doing something else" + newLine +
"20181115 15:01:01 - EXCEPTION: SillyUnexpectedException" + newLine +
"20181115 15:01:01 - ERROR: Oops!" + newLine +
"20181115 15:01:01 - Giving up" + newLine +
"20181115 15:01:01 - RESULT: TEST FAILED";
		
		ArrayList<String> s1 = new ArrayList<String>();
		
		System.out.println(s1);

	}
	
	public  static ArrayList<String> findMatch(String s) {
		ArrayList<String> line1 = new ArrayList<String>();
		String[] lines = s.split("\n");
		for(String line: lines) {
			if(line.contains("EXCEPTION:")) {
				line1.add(line);
				}
			else if(line.contains("ERROR:")) {
				line1.add(line);
			}
			else if(line.contains("RESULT:")) {
				line1.add(line);
			}
		}
		
		return line1;
	}
	


}
