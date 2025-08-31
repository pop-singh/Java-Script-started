class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if (piles.length == 0) return 0;
        
        int min = 1;
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile); // maximum speed needed is max pile size
        }
        
        int result = max;
        while (min <= max) {
            int mid =  (max +min) / 2;
            
            // Calculate hours needed at speed mid
            long hours = check(mid, piles);
            
            if (hours <= h) {
                // If Koko can finish in h hours or less,
                // try to find a smaller speed
                result = mid;
                max = mid - 1;
            } else {
                // Need more hours than allowed, increase speed
                min = mid + 1;
            }
        }
        
        return result;
    }
    
    private long check(int speed, int[] piles) {
        long count = 0;
        for (int pile : piles) {
            // Ceiling division: number of hours needed for this pile
            count += (pile + speed - 1) / speed;
        }
        return count;
    }
}
