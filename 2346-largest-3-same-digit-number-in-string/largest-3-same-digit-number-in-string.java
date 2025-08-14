class Solution 
{
    public String largestGoodInteger(String nums) 
    {
        String ans="";
        for(int i=2; i<nums.length(); i++)
        {
            if(nums.charAt(i)==nums.charAt(i-1) && nums.charAt(i-1)==nums.charAt(i-2))
            {
                String current=nums.substring(i-2, i+1);
                if(ans.isEmpty() || current.compareTo(ans)>0)
                {
                    ans=current;
                }
            }
        }    
        return ans;
    }
}