class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean value = true;
        while( n > 0 ){
            if((n & 1) == 1){ // 110
                if(((n>>1) & 1) == 0){
                    n = n >> 1;
                }else{
                    return false;
                }
            }
            else{
                if(((n >> 1) & 1) == 1){
                    n = n >> 1;
                }
                else{
                    return false;
                }
            }
        }
        return value;
    }
}