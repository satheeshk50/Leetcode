// class Solution {
//     public String customSortString(String order, String s) {
//         ArrayList<Character> a = new ArrayList<>();
//         for(int i=0;i<s.length();i++) a.add(s.charAt(i));
//         StringBuilder str = new StringBuilder();
//         for(int i=0;i<order.length();i++)
//         {
//             char temp = order.charAt(i);
//             do{
//                 if(a.contains(temp))
//                 {
//                     str.append(temp);
//                     a.remove(Character.valueOf(temp));
//                 } 
//             }while(a.contains(temp));
            
//         }
//         for(int i=0;i<a.size();i++)
//         {
//             str.append(a.get(i));
//         }
//         return str.toString();
//     }
// }
class Solution {
    public String customSortString(String order, String s) {
      int[] count = new int[26];
      for (int i = 0; i < s.length(); ++i) {
        ++count[(int)(s.charAt(i) - 'a')];
      }
      final var builder = new StringBuilder();
      for (int i = 0; i < order.length(); ++i) {
        final var ch = order.charAt(i);
        final var idx = (int)(ch - 'a');
        final var c = count[idx];
        count[idx] = 0;
        if (c > 0) {
          for (int j = 0; j < c; ++j) {
            builder.append(ch);
          }
        }
      }
      for (int i = 0; i < 26; ++i) {
        if (count[i] > 0) {
          final var ch = (char)(i + 'a');
          for (int j = 0; j < count[i]; ++j) {
            builder.append(ch);
          }
        }
      }
      return builder.toString();
    }
}