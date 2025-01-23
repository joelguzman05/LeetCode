import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counterS = new int[26];
        int[] counterT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counterS[s.charAt(i) - 'a'] ++;
            counterT[t.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < counterS.length; i++) {
            if (counterS[i] != counterT[i]) {
                return false;
            }
        }
        return true;
    }
}
