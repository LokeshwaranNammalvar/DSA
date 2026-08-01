class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int value = x;
        int reversed = 0;

        while(x>0)
        {
            int digit = x%10;
            reversed = reversed * 10 + digit;
            x/=10;
        }    
        if(value==reversed)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}