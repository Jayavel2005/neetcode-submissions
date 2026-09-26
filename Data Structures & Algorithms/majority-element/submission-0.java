class Solution {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int votes = 0;

        for (int num : nums) {
            if(votes == 0) {
                candidate = num;
                votes++;
            }
            else if (candidate == num) votes++;
            else votes--;
        }

        int count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }

        if (count > (nums.length / 2)) return candidate;
        return -1;
    }
}