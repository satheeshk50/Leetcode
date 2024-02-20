class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // if(nums[0]!=0) return 0;
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(nums[i]!=nums[i-1]+1) return nums[i]-1;
        // }
        // return nums[nums.length-1]+1;
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        int a_sum = (n*(n+1))/2;
        return a_sum-sum;
    }
}