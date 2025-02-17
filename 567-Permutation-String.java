class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] countS1 = new int[26];
        int[] countS2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            countS1[s1.charAt(i) - 'a']++;
            countS2[s2.charAt(i) - 'a']++;
        }

        int l = 0, r = s1.length();
        while (r < s2.length()) {
            if (Arrays.equals(countS1, countS2)) {
                return true;
            }
            countS2[s2.charAt(l) - 'a']--;
            countS2[s2.charAt(r) - 'a']++;
            l++;
            r++;
        }
        return Arrays.equals(countS1, countS2);
    }
}