class Solution {
    public int finalValueAfterOperations(String[] op) {
        int n = op.length;
        int x = 0;
        for(int i=0;i<n;i++)
        {
            if(op[i].compareTo("X++")==0) x++;
            else if(op[i].compareTo("++X")==0) x++;
            else if(op[i].compareTo("--X")==0) x--;
            else x--;
        }
        return x;
    }
}