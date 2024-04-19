class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                // char c = grid[i][j];
                if(grid[i][j]=='1'){
                    backtrack(i,j,grid,n,m);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void backtrack(int i,int j,char[][] grid,int n,int m)
    {
        if(i<0||i>=n||j<0||j>=m||grid[i][j]!='1') return;
        else {
            grid[i][j] = 'A';
            backtrack(i+1,j,grid,n,m);
            backtrack(i-1,j,grid,n,m);
            backtrack(i,j+1,grid,n,m);
            backtrack(i,j-1,grid,n,m);
        }
        return;
    }
}