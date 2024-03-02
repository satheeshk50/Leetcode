class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int i=1;
        backtrack(k,n,ans,l,i,0);
        return ans;
    }
    public void backtrack(int k,int n,List<List<Integer>> ans,List<Integer> l ,int start,int sum)
    {
        if(n<0) return;
        else if(l.size()==k&&sum<n) return;
        else if(l.size()==k&&n==sum)
        {
            ans.add(new ArrayList<>(l));
        }
        else{
            for(int i=start;i<=9;i++)
            {
                l.add(i);
                sum+=i;
                backtrack(k,n,ans,l,i+1,sum);
                sum-=l.get(l.size()-1);
                l.remove(l.size()-1);
            }
        }
        
    }
}