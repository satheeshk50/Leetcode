class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double d=0;
        int arr[] = new int[m+n];
        int j=0;
        int z =0;
        for(int i=0;i<m+n;i++)
        {
            if(j<m)
            {
                arr[i] = nums1[j++];
            }
            else
            {
                
                arr[i] = nums2[z++];
            }
        }
        Arrays.sort(arr);
        if((m+n)%2==0)
        {
            int p = (m+n)/2;
            double o = arr[p-1]+arr[p];
            d = o/2.0;
            return d;
        }
        else{
            int t = (m+n)/2;
            d = arr[t];
            return d;
        }
    }
}