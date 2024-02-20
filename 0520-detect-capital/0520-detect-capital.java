class Solution {
    public boolean detectCapitalUse(String word) {
        // String capital = word.toUpperCase();
        // if(capital.compareTo(word)==0) return true;
        // String small = word.toLowerCase();
        // if(small.compareTo(word)==0) return true;
        // // StringBuilder str = new StringBuilder(small);
        // for(int i=0;i<word.length();i++)
        // {
        //     if(i==0&&(word.charAt(i)>='A'&&word.charAt(i)<='Z')) continue;
        //     if(word.charAt(i)<'a'||word.charAt(i)>'z') return false;
        // }
        // return true;
        int small=0;
        int cap = 0;
        int n = word.length();
        for(int i=0;i<n;i++)
        {
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z') cap++;
            else small++;
        }
        if(cap==n) return true;
        if(small==n) return true;
        if((word.charAt(0)>='A'&&word.charAt(0)<='Z')&&small==n-1) return true;
        return false;
    }
}