class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean b[] = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        backtrack(nums,b,s,ans,l);
        return ans;
    }
    public void backtrack(int[] nums,boolean[] b,Set<List<Integer>> s,List<List<Integer>> ans,List<Integer> l)
    {
        if(l.size()==nums.length&&!s.contains(l))
        {
            ans.add(new ArrayList<>(l));
            s.add(l);
            return;
        }
        else{
            for(int i=0;i<nums.length;i++)
            {
                if(b[i]) continue;
                b[i]=true;
                l.add(nums[i]);
                backtrack(nums,b,s,ans,l);
                b[i]=false;
                l.remove(l.size()-1);
            }
        }
    }
}