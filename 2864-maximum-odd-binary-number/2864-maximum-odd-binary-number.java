class Solution {
    public String maximumOddBinaryNumber(String s) {
        char arr[] = s.toCharArray();
        int j = 0;
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            if(arr[j]=='0'&&arr[i]=='1') 
            {
                swap(arr,i,j);
                j++;
            }
            if(arr[j]=='1') j++;
        }
        // System.out.println(arr);
        for(int i=0;i<len-1;i++)
        {
            if(arr[i]=='1'&&arr[i+1]=='0')
            {
                swap(arr,i,len-1);
                break;
            }
        }
        // System.out.println(arr);
        String ans="";
        for(int i=0;i<len;i++) ans+=arr[i];
        return ans;
    }
    public void swap(char[] arr,int i,int j)
    {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}