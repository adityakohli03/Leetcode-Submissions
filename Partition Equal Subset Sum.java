class Solution {
   static boolean subsetSum(int num[],int n,int sum)
    {
        boolean dp[][]=new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++)
            dp[i][0]=true;
        for(int i=1;i<=sum;i++)
            dp[0][i]=false;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(j<num[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]  || dp[i-1][j-num[i-1]];
            }
        }
        return dp[n][sum];
    }
    public boolean canPartition(int[] num) {
        int sum=0;
        int n=num.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+num[i];
        }
        if(sum%2!=0)
            return false;
        else
            return subsetSum(num,n,sum/2);
        
    }
}