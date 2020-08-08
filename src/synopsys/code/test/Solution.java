package synopsys.code.test;

import java.util.ArrayList;

public class Solution {

    /**
     * Tags used to flag important log messages.
     **/
    enum Tag {
        EXCEPTION,
        ERROR,
        RESULT
    }
	String newLine = System.getProperty("line.separator");
	String s = "20181115 15:01:01 - Doing something" + newLine +
"20181115 15:01:01 - Doing something else" + newLine +
"20181115 15:01:01 - EXCEPTION: SillyUnexpectedException" + newLine +
"20181115 15:01:01 - ERROR: Oops!" + newLine +
"20181115 15:01:01 - Giving up" + newLine +
"20181115 15:01:01 - RESULT: TEST FAILED";
    /**
     * Encapsulates important log messages for further processing.
     **/
    class Important {
        // fill in with necessary details
        Tag tag;
        String msg;
        
        Important(Tag tag, String s) {
            this.tag = tag;
            this.msg = s;
        }
        
        public String toString() {
            return tag + " found: " + msg;   
        }
    }
    
    ArrayList<Important> highlights;
    
    public Solution() {
        // add necessary stuff here
        highlights = new ArrayList<Important>();
    }
    
    public String solution(String log) {
        // write your code in Java

        String[] lines = log.split("\n");
        
        
        for (String line : lines) {
            // System.out.println(line);
            
            Important imp = null;
            if (line.contains(" EXCEPTION:")) {
                imp = new Important(Tag.EXCEPTION, line);
                highlights.add(imp); 
            }
            else if (line.contains(" ERROR:")) {
                imp = new Important(Tag.ERROR, line);
                highlights.add(imp); 
            }
            else if (line.contains(" RESULT:")) {
                imp = new Important(Tag.RESULT, line);
                highlights.add(imp); 
            }
                
               
        }
        ///// DO NOT CHANGE THE CODE BELOW /////
        return formatResults();
    }
    
    ///// DO NOT CHANGE CODE BELOW /////
    private String formatResults() {
        String results = "{";
        for (Important item : highlights) {
            results += "'" + item + "',";
        }
        results += "}";
        return results;
    }

}
