class Solution {
    public int findDuplicate(int[] nums) {
        int sum=0;
        int n=nums.length;
//         // for(int i=0;i<n;i++)
//         // {
//         //     sum+=nums[i];
//         }
//         // int actualSum = (n*(n+1))/2;
//         // Arrays.sort(nums);
//         // for(int i=0;i<n-1;i++)
//         // {
//         //     if(nums[i]==nums[i+1]) return nums[i];
//         // }
//         // return -1;
        HashSet<Integer> l =new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(l.contains(nums[i])) return nums[i];
            l.add(nums[i]);
        }
        return -1;
    }
}