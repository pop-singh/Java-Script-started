class Solution {
    public int[] getNoZeroIntegers(int n) {
       
       
        int j=n-1;
        for(int i=1;i<n;i++)
        {  
           boolean flag= check(i,j);
            if(flag){
                 return new int[]{i,j};
            }
            j--;
        }

       return new int[]{1,1};
        
    }

    public static boolean check(int i, int j)
    {
        String str1=Integer.toString(i);
        String str2=Integer.toString(j);
         
        for(int ii=0;ii<str1.length();ii++)
        {
            if(str1.charAt(ii)=='0')
            {
                return false;
            }
            
        }
        for(int ii=0;ii<str2.length();ii++)
        {
            if(str2.charAt(ii)=='0')
            {
                return false;
            }
            
        }


        return true;

    }


}