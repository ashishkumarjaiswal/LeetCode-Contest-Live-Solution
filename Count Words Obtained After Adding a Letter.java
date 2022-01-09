class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < startWords.length; i++) {
            char[] arr = startWords[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            map.put(s, 1);
        }
        for (int i = 0; i < targetWords.length; i++) {
            char[] arr = targetWords[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            for (int j = 0; j < s.length(); j++) {
                String ns = s.substring(0, j) + s.substring(j + 1);
                if (map.containsKey(ns)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
