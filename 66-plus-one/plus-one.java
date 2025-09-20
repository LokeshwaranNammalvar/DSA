class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++)    
        {
            ans[i] = digits[i];
        }
        for(int i=n-1; i>=0; i--)
        {
            ans[i]++;
            if(ans[i]<10)
            {
                return ans;
            }
            else
            {
                ans[i]=0;
            }
        }
        int[] result=new int[n+1];
        result[0]=1;
        return result;
    }
}