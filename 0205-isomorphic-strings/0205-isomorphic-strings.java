class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> m = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            // if((m.containsKey(s.charAt(i))||m.containsKey(t.charAt(i)))&&(m.get(s.charAt(i))!=t.charAt(i)||m.get(t.charAt(i))!=s.charAt(i)))
            // {
            //     return false;   
            // }
            if(!m.containsKey(s.charAt(i)))
            {
                if(!m.containsValue(t.charAt(i)))
                {
                    m.put(s.charAt(i),t.charAt(i));
                }
                else return false;
            }
            else{
                if(m.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            // if(m.containsKey(t.charAt(i))&&m.get(t.charAt(i))!=s.charAt(i)) return false;
            // m.put(s.charAt(i),t.charAt(i));
            // m.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}