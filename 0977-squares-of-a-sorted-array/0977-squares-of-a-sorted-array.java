class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int len = nums.length;
        int[] ans = new int[len];
        int k=len-1;
        int j=len-1;
        while(i<=j)
        {
            if((nums[i]*nums[i])>(nums[j]*nums[j]))
            {
                ans[k--]=nums[i]*nums[i];
                i++;
            }
            else if((nums[i]*nums[i])<=(nums[j]*nums[j]))
            {
                ans[k--]=nums[j]*nums[j];
                j--;
            }
        }
         return ans;
    }
}