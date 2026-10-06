class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int l = 0;
        int max = 0;

        for (int r = 0; r < fruits.length; r++) {

            freq.put(
                fruits[r],
                freq.getOrDefault(fruits[r], 0) + 1
            );

            while (freq.size() > 2) {

                int fruit = fruits[l];

                freq.put(fruit, freq.get(fruit) - 1);

                if (freq.get(fruit) == 0) {
                    freq.remove(fruit);
                }

                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}