class Solution {
    public int minimumLength(String s) {
        int i=0;
        int n = s.length();
        int j = n-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                char temp = s.charAt(i);
                i++;
                j--;
                while(i<=j)
                {
                    if(s.charAt(i)==temp) i++;
                    else break;
                }
                while(i<=j)
                {
                    if(s.charAt(j)==temp) j--;
                    else break;
                }
            }
            else break;
        }
        return j-i+1;
    }
}