class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1000000000;
        while(start<=end){
            int mid = start + (end - start ) / 2;
            if(inTimeEating(piles, mid , h)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }  
        return start;
    }
        public boolean inTimeEating(int[] piles, int k, int h){
            long hours = 0;
            for(int s : piles){
                int div = s/ k ;
                hours = hours + div;
                if(s % k != 0){
                    hours++;
                }
            }
            return hours<=h;
        }
    }