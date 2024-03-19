class Solution {
    public boolean isPowerOfFour(int n) {
        int count1 = 0;
        int count0 = 0;
        if(n == 1){
            return true;
        }
        while(n > 2){
            if((n & 1) == 1){
                return false;
            }
            else{
                n = n >> 1;
                count0 += 1;
            }
        }
        count0 += 1;
        return count0 % 2 == 0;
    }
}