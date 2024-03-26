class Solution {
    public int firstMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int j=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]>0)
            {
                j=i;
                if(arr[i]!=1)
                {
                    // System.out.println("dd");
                    return 1;
                    
                }
                break;
            }
        }
        System.out.println("dd");
        for(j=j;j<len-1;j++)
        {
            if(arr[j]+1!=arr[j+1]&&arr[j]!=arr[j+1])
            {
                return arr[j]+1;
            }
        }
        System.out.println(j);
        if(j==len-1&&arr[j]>0)
        {
            return arr[j]+1;
        }
        return 1;
    }
}