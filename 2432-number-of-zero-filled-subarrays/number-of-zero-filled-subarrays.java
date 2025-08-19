class Solution {
    public long zeroFilledSubarray(int[] arr) {
        long ans=0;
        int len=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                len++;
                ans+=len;
            }
            else
            {
                 
                 len=0;
            }
            
        }
      
        return ans;
        

    }
}