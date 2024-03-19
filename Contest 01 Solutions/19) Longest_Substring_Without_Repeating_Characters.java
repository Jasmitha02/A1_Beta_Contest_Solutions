class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int maxLen = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i)] == 0){
                arr[s.charAt(i)] = 1;
                maxLen += 1;
            }
            else{
                char a = s.charAt(i);
                i = i - 1;
                while(s.charAt(i) != a){
                    i -= 1;
                }
                ans = Math.max(ans, maxLen);
                Arrays.fill(arr, 0);
                maxLen = 0;
            }
        }
        return Math.max(maxLen, ans);
    }
}