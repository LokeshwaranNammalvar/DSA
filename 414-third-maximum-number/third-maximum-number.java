class Solution {
    public int thirdMax(int[] nums) 
    {
    TreeSet<Integer> value = new TreeSet<>(Collections.reverseOrder());
        for(int n:nums)
        {
            value.add(n);
        }

        int count=0;
        for(int num:value)
        {
            count++;
            if(count==3)
            {
                return num;
            }
        } 
        return value.first();   
    }
}