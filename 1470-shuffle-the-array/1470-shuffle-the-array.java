class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int arr[] = new int[len];
        int j = 0;
        for(int i=0;i<n;i++)
        {
            arr[j] = nums[i];
            j=j+2;
        }
        j=1;
        for(int i=n;i<len;i++)
        {
            arr[j] = nums[i];
            j=j+2;
        }
        return arr;
    }
}