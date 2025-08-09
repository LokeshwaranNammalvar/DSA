class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {
        int n=arr.length;
        if(n<3)    
        {
            return false;
        }
        int left=0;
        int right=arr.length-1;
        while(left+1<n && arr[left]<arr[left+1])
        {
            left++;
        }
        while (right - 1 >= 0 && arr[right] < arr[right - 1])
        {
            right--;
        }
        return left > 0 && right < n-1 && left==right;
    }
}