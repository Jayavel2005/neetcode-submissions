class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(char c : s.toCharArray()){
            if(!map1.containsKey(c)){
                map1.put(c, 1);
            }else{
                map1.put(c,map1.get(c) + 1);
            }
        }

        for(char c : t.toCharArray()){
            if(!map2.containsKey(c)){
                map2.put(c, 1);
            }else{
                map2.put(c,map2.get(c) + 1);
            }
        }

        for (char c : map1.keySet()) {
            if (!map2.containsKey(c) || !map1.get(c).equals(map2.get(c))) {
                return false;
            }
        }

        return true;
    }
}
