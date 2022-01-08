class Solution {
    public int longestPalindrome(String[] words) {
        int total = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> palindrome = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (s.charAt(0) == s.charAt(1)) {
                palindrome.put(s, palindrome.getOrDefault(s, 0) + 1);
                continue;
            }
            String c = s.substring(1) + s.substring(0, 1);
            if (map.containsKey(c)) {
                total = total + 4;
                if (map.get(c) == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);
                }
            } else {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        List<Integer> val = new ArrayList<>(palindrome.values());
        boolean flag = false;
        boolean odd = false;
        Collections.sort(val);
        int paltotal = 0;
        for (int i = val.size() - 1; i >= 0; i--) {
            if (val.get(i) == 1) {
                paltotal = paltotal + 2;
                flag = true;
                break;
            }
            if (!odd) {
                odd = val.get(i) % 2 != 0;
            }
            int a = (val.get(i) / 2) * 4;
            paltotal = paltotal + a;
        }
        if (odd && !flag) {
            return total + paltotal + 2;
        }
        return total + paltotal;

    }
}
