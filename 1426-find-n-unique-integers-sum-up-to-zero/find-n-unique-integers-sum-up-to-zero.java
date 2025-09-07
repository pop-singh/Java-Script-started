class Solution {
    public int[] sumZero(int n) {
       if(n==1)
       {
        return new int[] {0};
       }
        int min=-(n/2);
     
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {   
            if(n%2==0)
            {
                if(min==0)
                {
                    min++;
                }
            }
            arr[i]=min++;
        }
        return arr;
    }
}