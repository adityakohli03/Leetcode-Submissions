class Solution {
    private boolean[][] subsetSum(int[] arr,int sum)
    {
        int n=arr.length;
        boolean[][] t=new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++)
            t[i][0]=true;
        for(int i=1;i<=sum;i++)
            t[0][i]=false;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(j<arr[i-1])
                    t[i][j]=t[i-1][j];
                else
                    t[i][j]=t[i-1][j] || t[i-1][j-arr[i-1]];
            }
        }
        return t;
    }
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int i=0;i<stones.length;i++)
        {
            sum=sum+stones[i];
        }
        boolean[][] t=subsetSum(stones,sum);
        
        int min=Integer.MAX_VALUE;
        int k=0;
        int N=stones.length;
        
        while(k<=sum/2)
        {
            if(t[N][k])
            {
                min=Math.min(min,sum-2*k);
            }
            k++;
        }
        return min;
    }
}