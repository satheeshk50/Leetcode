class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        int max=0;
        for(int i=0;i<101;i++)
        {
            if(max<arr[i]) max=arr[i];
        }
        int count=0;
        for(int i=0;i<101;i++)
        {
            if(arr[i]==max) count+=arr[i];
        }
        return count;
    }
}