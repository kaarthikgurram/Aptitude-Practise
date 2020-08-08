package synopsys.code.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AmazonCodeTest2 {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<Integer> lengthEachScene(List<Character> inputList)
    {
        // WRITE YOUR CODE HERE
        
        Set<Character> set = new HashSet<Character>();
        List<Integer> out = new ArrayList<Integer>();
        int start = 0;
        
        for (int i = 0; i < inputList.size(); i++) {
           
            Character curr = inputList.get(i);
            set.add(curr);
            
            List<Character> sl = inputList.subList(i + 1, inputList.size());
            
            if (!isPresent(set, sl)) {
                int len = i - start + 1;
                out.add(len);
                start = i + 1;
            }
        }
        
        return out;
    }
    // METHOD SIGNATURE ENDS
    
    public boolean isPresent(Set<Character> set, List<Character> sl) {
        boolean ret = false;
        
        for (Character c : set) {
            if (sl.indexOf(c) != -1) {
                ret = true;
                break;
            }
        }
        
        return ret;
    }

}
