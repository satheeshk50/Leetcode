import java.util.*;
class Solution {
    public int findJudge(int n, int[][] trust) {
        Set<Integer> s =new HashSet<>();
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<trust.length;i++)
        // {
        //     map.put(trust[i][0],trust[i][1]);
        // }
        int sum = 0;
        for(int i=0;i<trust.length;i++)
        {
            if(!s.contains(trust[i][0]))
            {
                sum+=trust[i][0];
                s.add(trust[i][0]);
            }
        }
        int ans = ((n*(n+1))/2)-sum;
        if(trust.length==0&&n==1) return 1;
        if(ans==0||trust.length==0||ans>n) return -1;
        int arr[] = new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            arr[trust[i][1]]+=1;
        }
        if(arr[ans]==n-1) return ans;
        return -1;
            
        // for(int i=1;i<=n;i++)
        // {
        //     if(ans!=i&&(!map.containsKey(i)||map.get(i)!=ans))
        //     {
        //         return -1;
        //     }
        // }
        // return ans;
        // for(int i=0;i<trust.length;i++)
        // {
        //     if(!map.containsKey(trust[i][0])) return trust[i][0];
        //     if(!map.containsKey(trust[i][1])) return trust[i][1];
        // }
        // return -1;
        
    }
    
}