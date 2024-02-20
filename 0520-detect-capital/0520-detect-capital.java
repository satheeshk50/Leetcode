class Solution {
    public boolean detectCapitalUse(String word) {
        String capital = word.toUpperCase();
        if(capital.compareTo(word)==0) return true;
        String small = word.toLowerCase();
        if(small.compareTo(word)==0) return true;
        // StringBuilder str = new StringBuilder(small);
        for(int i=0;i<word.length();i++)
        {
            if(i==0&&(word.charAt(i)>='A'&&word.charAt(i)<='Z')) continue;
            if(word.charAt(i)<'a'||word.charAt(i)>'z') return false;
        }
        return true;
    }
}