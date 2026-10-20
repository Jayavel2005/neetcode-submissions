class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);
            while (map.getOrDefault(ch, 0) > 0) {

                char leftChar = s.charAt(l);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                l++;
            }

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}