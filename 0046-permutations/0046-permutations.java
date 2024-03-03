class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backtrack(ans,l,nums);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> l ,int[] nums)
    {
        if(l.size()==nums.length) ans.add(new ArrayList<>(l));
        else{
            for(int n:nums)
            {
                if(l.contains(n)) continue;
                l.add(n);
                backtrack(ans,l,nums);
                l.remove(l.size()-1);
            }
        }
    }
}