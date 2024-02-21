// class Solution {
//     public int rangeBitwiseAnd(int left, int right) {
//         int ans=left;
//         if(left==right) return left;
//         for(int i=left+1;i<=right;i++) 
//         {
//             ans=ans&i;
//             if(ans==0) return 0;
//             if(i==Integer.MAX_VALUE) break;
//         }
//         return ans;
//     }
// }
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
        while(left != right)
        {
            left = left >> 1;
            right = right >> 1;
            cnt++;
        }
        return left << cnt;
    }
}