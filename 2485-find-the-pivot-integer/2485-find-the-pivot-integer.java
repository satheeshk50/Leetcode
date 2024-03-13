// class Solution {
//     public int pivotInteger(int n) {
//         int arr[] = new int[n];
//         int sum = n;
//         for(int i=n-1;i>=0;i--)
//         {
//             arr[i] = sum;
//             sum += i;
//         }
//         int j = n-1;
//         int asum=0; 
//         for(int i=1;i<=j+1;i++)
//         {
//             asum+=i;
//             if(asum>arr[j]) j--;
//             if(asum==arr[j]&&i==j+1) return j+1;
//         }
//         return -1;
//     }
// }
class Solution {
    public int pivotInteger(int n) {
        int y = n*(n+1)/2;
        int x = (int)Math.sqrt(y);
        if(x*x==y) return x;
        else return -1;
    }
}