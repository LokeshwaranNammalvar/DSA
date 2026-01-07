class Solution {
    public int maxProfit(int[] prices) 
    {
        int minPrice=Integer.MAX_VALUE;
        int maxPrice=0;

        for(int num:prices)
        {
            if(num<minPrice)
            {
                minPrice=num;
            }
            else if(num-minPrice >maxPrice)
            {
                maxPrice=num-minPrice;
            }
        }    
        return maxPrice;
    }
}