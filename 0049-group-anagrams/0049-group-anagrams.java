class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String,List<String>> m = new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!m.containsKey(key))
            {
                m.put(key,new ArrayList<>());
            }
            m.get(key).add(s[i]);
        }
        List<List<String>> l = new ArrayList<>();
        for(List<String> i : m.values())
        {
            l.add(i);
        }
        return l;
    }
}
//         List<List<String>> l = new ArrayList<>();
//         int n = s.length;
//         for(int i=0;i<n;i++)
//         {
//             String a = s[i];
//             List<String> in = new ArrayList<>();
//             in.add(a);
//             for(int j=i+1;j<n;j++)
//             {
//                 String a2 = s[j];
//                 boolean b = isanagram(a,a2);
//                 if(b)
//                 {
//                     in.add(a2);
//                     String h = s[n-1];
//                     s[n-1] = s[j];
//                     s[j] = h;
//                     n--;
//                     j--;
//                 }
//             }
//             l.add(in);
//         }
//         return l;
//     }

//     boolean isanagram(String a,String a2)
//     {
//         if(a.length()!=a2.length()) return false;
//         int arr[] = new int[26];
//         for(int i=0;i<a.length();i++)
//         {
//             arr[a.charAt(i)-'a']++;
//             arr[a2.charAt(i)-'a']--;
//         }
//         for(int i=0;i<26;i++)
//         {
//             if(arr[i]!=0) return false;
//         }
//         return true;
//     }
// }
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();
        
//         for (String word : strs) {
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String sortedWord = new String(chars);
            
//             if (!map.containsKey(sortedWord)) {
//                 map.put(sortedWord, new ArrayList<>());
//             }
            
//             map.get(sortedWord).add(word);
//         }
        
//         return new ArrayList<>(map.values());
//     }
// }