class Solution {
    public String convert(String s, int n) {
        String x[] = new String[n];
        int len = s.length();
        for(int i=0;i<n;i++)
        {
            x[i]="";
        }
        int j=0;
        int i=0;
        if(n==1)
        {
            return s;
        }
        while(i!=len)
        {
            while(j<n&&i!=len)
            {
                x[j]=x[j]+s.charAt(i++);
                j++;
            }
            j=j-2;
            
            while(j>=0&&i!=len)
            {
                x[j]=x[j]+s.charAt(i++);
                j--;
            }
            j=j+2;
        }
        String ans = "";
        for(int l=0;l<n;l++)
        {
            ans+=x[l];
        }
        return ans;
    }
}