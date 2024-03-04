class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        Arrays.sort(token);
        int score = 0;
        int maxscore = 0;
        // if(token.length==0||token[0]>power) return 0;
        // else 
        // {
        //     power-=token[0];
        //     score+=1;
        // }
        // System.out.println(1);
        int n = token.length;
        int j = n-1;
        int i=0;
        while(i<=j)
        {
            if(token[i]<=power)
            {
                power-=token[i];
                score+=1;
                i++;
            }
            else if(score>=1&&i!=j){
                power+=token[j];
                j--;
                score-=1;
            }
            else i++;
        }
        return score;
        // int n = token.length;
        // int j = n-1;
        // int i = 0;
        // while(i<=j)
        // {
        //     if(power>=token[i])
        //     {
        //         score++;
        //         power-=token[i];
        //         i++;
        //         maxscore = Math.max(score,maxscore);
        //     }
        //     else if(score>=1)
        //     {
        //         score--;
        //         power+=token[j];
        //         j--;
        //         maxscore = Math.max(score,maxscore);
        //     }
        //     else return score;
        // }
        // return maxscore;
    }
}