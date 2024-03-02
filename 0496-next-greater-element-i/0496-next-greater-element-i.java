class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        // Stack<Integer> s = new Stack<>();
        // for(int i=0;i<n)
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<m;i++)
        {
            int num = nums2[i];
            int j=i+1;
            while(j<m)
            {
                if(nums2[j]>num)
                {
                    h.put(num,nums2[j]);
                    break;
                }
                j++;
            }
            if(j==m) h.put(num,-1);
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = h.get(nums1[i]);
        }
        return ans;
    }
}