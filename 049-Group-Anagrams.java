

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : strs) {
            int[] letterCount = new int[26];
            for (char letter : word.toCharArray()) {
                letterCount[letter - 'a'] ++;
            }
            String key = Arrays.toString(letterCount);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(word);
        }
        return anagrams.values().stream().toList();
    }
}