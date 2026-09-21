class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(k++, i, nums);
            }
        }
    }


    public void swap(int left, int right,int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}