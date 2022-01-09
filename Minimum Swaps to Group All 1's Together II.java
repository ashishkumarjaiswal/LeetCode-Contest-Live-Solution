class Solution {
    public int minSwaps(int[] nums) {
        int one = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                one++;
        }
        int maxOne = 0;
        for (int i = 0; i < one; i++) {
            if (nums[i] == 1)
                maxOne++;
        }
        int max = maxOne;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 1)
                maxOne--;
            if (nums[(i + one - 1) % nums.length] == 1)
                maxOne++;
            if (maxOne > max)
                max = maxOne;
        }
        int ans = one - max;
        return ans;
    }
}
