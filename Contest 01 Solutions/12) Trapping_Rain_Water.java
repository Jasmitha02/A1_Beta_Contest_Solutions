class Solution {
    public int trap(int[] arr) {
        int count = 0;
        int[] maxLeft = new int[arr.length];
        maxLeft[0] = arr[0];
        int[] maxRight = new int[arr.length];
        maxRight[arr.length-1] = arr[arr.length-1];
        for(int i = 1; i < arr.length; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], arr[i]);
        }
        for(int i = arr.length-2; i >= 0; i--){
            maxRight[i] = Math.max(maxRight[i+1], arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            count += Math.min(maxLeft[i], maxRight[i]) - arr[i];
        }
        return count;
    }
}