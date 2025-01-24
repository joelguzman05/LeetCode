import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int maxLength = 0;
        Set<Character> characterSet = new HashSet<>();
        while (r < s.length()) {
            while (characterSet.contains(s.charAt(r))) {
                characterSet.remove(s.charAt(l));
                l ++;
            }
            characterSet.add(s.charAt(r));
            maxLength = Integer.max(maxLength, r - l + 1);
            r ++;
        }
        return maxLength;
    }
}
