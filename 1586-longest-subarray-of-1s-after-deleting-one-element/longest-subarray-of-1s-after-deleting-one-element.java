class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

     
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == 1) {
                left[i] = left[i - 1] + 1;
            }
        }


        for (int j = n - 2; j >= 0; j--) {
            if (nums[j + 1] == 1) {
                right[j] = right[j + 1] + 1;
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
          
            res = Math.max(res, left[i] + right[i]);
        }

        
        return res == n ? n - 1 : res;
    }
}
