class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int[] preSum = new int[n];
        preSum[0] = arr[0];
        for(int i = 1; i < n; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(preSum[i], map.getOrDefault(preSum[i],0)+1);
        }
        for(int i: map.keySet()){
            if(i == 0 || map.get(i) == 2){
                return true;
            }
        }
        return false;
    }
}
