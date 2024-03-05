class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0;i<2*n;)
        {
            if(j==n)
            {
                j=0;
            }
            else{
                ans[i++]=nums[j++];
            }
        }
        return ans;
    }
}