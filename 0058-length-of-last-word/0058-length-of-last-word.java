import java.util.StringTokenizer; 
class Solution {
    public int lengthOfLastWord(String s) {
        // int i = s.length()-1;
        // int count=0;
        // while(i>=0){
        //     if(s.charAt(i)!=' ')
        //     {
        //         break;
        //     }
        //     i--;
        // }
        // while(i>=0)
        // {
        //     if(s.charAt(i)==' ')
        //     {
        //         break;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // return count;
        StringTokenizer st = new StringTokenizer(s," ");
        String l = "";
        while(st.hasMoreTokens())
        {
            l = st.nextToken();
        }
        return l.length();
    }
}