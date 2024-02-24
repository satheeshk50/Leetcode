class Solution {
    public String countAndSay(int n) {
     if(n==1) return "1";
     String s = countAndSay(n-1);
     int l = s.length();
     int i=0;
     String res="";
     while(i<l) 
     {
        int count = 1;
        int j = i;
        while(j+1!=l)
        {
            if(s.charAt(j)==s.charAt(j+1))
            {
                count++;
                j++;
            }
            else break;
        }
        res+=String.valueOf(count)+s.charAt(i);
        i=j+1;
     }
     return res;
    }

}