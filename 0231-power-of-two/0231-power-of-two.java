import java.util.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        double temp = 0;
        int i = 0;
        while(temp<=n)
        {
            temp = Math.pow(2,i);
            i++;
            if(temp==n)
            {
                return true;
            }
        }
        return false;
        //  int a = 0;
        // while(true){
        //     if(Math.pow(2,a) == n){
        //         return true;
        //     }else if(Math.pow(2,a)< n){
        //         a++;
        //     }else{
        //         return false;
        //     }
        // }
    }
}