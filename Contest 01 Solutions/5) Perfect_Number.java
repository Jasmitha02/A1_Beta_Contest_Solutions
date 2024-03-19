class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int sum = 0;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i = 2; i*i < num; i++){
            if(num % i == 0){
                arr.add(i);
                arr.add(num/i);
            }
        }
        for(int i: arr){
            sum += i;
        }
        return sum == num;
    }
}