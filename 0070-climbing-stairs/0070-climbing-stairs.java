class Solution {
    public int climbStairs(int n) {
        // if(n==0||n==1) {
        //     return 1;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);
        int arr[] = new int[n+1];
        arr[0]=arr[1] = 1;
        for(int i=2;i<=n;i++)
        {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
// class Solution {
//     public int climbStairs(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }
// 1 1 1 1 1
// 1 1 1 2
// 1 1 2 1
// 1 2 1 1
// 2 1 1 1
// 2 2 1
// 1 2 2
// 2 1 2
// 1 1 1 1
// 1 2 1
// 1 1 2
// 2 1 1 
// 2 2
