class Solution {
    public int findClosest(int x, int y, int z) {
        
        int x_steps=Math.abs(z-x);
        int y_steps=Math.abs(z-y);

        if(x_steps==y_steps)
        {
            return 0;
        }
        return x_steps<y_steps?1:2;
        
    }
}