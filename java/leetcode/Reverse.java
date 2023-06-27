package leetcode;
public class Reverse {
    public String reverse(String s) {
        // your algorithm here
        String p = "";
        if(s.length() == 1){
            p += s;
            return p;
        }
        
        p += reverse(s.substring(s.length() - 1));
        
        return p;
    }
}
