class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer> num = new ArrayList<>(); 
            
            for(int i=0;i<nums1.length;i++)
            {
                for(int j=0;j<nums2.length;j++)
                {
                    if(nums1[i]==nums2[j])
                    {
                        num.add(nums1[i]);
                    }
                }
            }  
        HashSet<Integer> num2 = new HashSet<>(num);

        int[] result = new int[num2.size()];
        int index=0;
        for(int n:num2)
        {
            result[index++]=n;
        }
        return result;
         
    }
}