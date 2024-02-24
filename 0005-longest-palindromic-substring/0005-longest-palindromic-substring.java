class Solution {
    // public static boolean check(String c)
    // {
    //     int j = c.length()-1;
    //     for(int i=0;i<c.length()/2;i++)
    //     {
    //         if(c.charAt(i)!=c.charAt(j--))
    //         {
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }
    // public String longestPalindrome(String s) {
    //     int l =  s.length();
    //     int x = l;
    //     boolean b = false;
    //     int p=0;
    //     int h = 0;
    //     // if(l==1)
    //     // {
    //     //     return s;
    //     // }
    //     if(check(s))
    //     {
    //         return s;
    //     }
    //     else{
    //     for(int i=0;i<l;i++)
    //     {
    //         for(int j=x;i<=j;j--)
    //         {
    //             String c = s.substring(i,j);
    //             b = check(c);
    //             if(b)
    //             {
    //                 if(j-i>h-p)
    //                 {
    //                p = i;
    //                h = j;
    //                 }
    
    //             }
    //         }
    //     }  
    //     }  
    //     return s.substring(p,h);
     int maxLen = 0;
    int lo = 0;
    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }
        
        for(int i = 0; i<input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }
    
    public void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j+1;
        }
    }
}