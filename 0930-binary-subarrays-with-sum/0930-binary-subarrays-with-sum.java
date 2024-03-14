class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int len = nums.length;
        int count=0;
        for(int i=0;i<len;i++)
        {
            int sum = nums[i];
            if(sum==goal) count++;
            for(int j=i+1;j<len;j++)
            {
                sum+=nums[j];  
                if(sum>goal) break; 
                if(sum==goal) count++;
            }
        }
        return count;
    }
}