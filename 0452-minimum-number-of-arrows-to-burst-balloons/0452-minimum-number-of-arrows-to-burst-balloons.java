class Solution {
    public int findMinArrowShots(int[][] points) {
         if (points == null || points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int end = points[0][1];
        int len = points.length;
        for(int i=1;i<len;i++)
        {
            if(points[i][0]>end)
            {
                end = points[i][1];
                arrows++;
            }
        }
        return arrows;
    }
}