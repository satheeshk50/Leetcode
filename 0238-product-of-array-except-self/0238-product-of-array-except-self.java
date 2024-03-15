class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int product = 1;
        int zero_count = 0;
        boolean zero = false;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                zero_count++;
                zero = true;
                continue;
            }
            product*=nums[i];
        }
        if(zero_count>1) return ans;
        for(int i=0;i<n;i++)
        {
            if(zero) 
            {
                if(nums[i]!=0) ans[i] = 0;
                else ans[i] = product;
            }
            else{
                ans[i] = product/nums[i];
            }
        }
        return ans;
    }
}