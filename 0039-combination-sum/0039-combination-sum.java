class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l  = new ArrayList<>();
        backTrack(nums,target,ans,l,0);
        return ans;
    }
    public void backTrack(int nums[],int target,List<List<Integer>> ans,List<Integer> l,int start)
    {
        if(target<0) return;
        else if(target == 0) ans.add(new ArrayList<>(l));
        else{
            for(int i=start;i<nums.length;i++)
            {
                l.add(nums[i]);
                backTrack(nums,target-nums[i],ans,l,i);
                l.remove(l.size()-1);
            }
        }
    }
}