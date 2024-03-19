class Sol
{
    int isPossible (String S)
    {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < S.length(); i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for(int i: map.values()){
            if(i % 2 == 1){
                count += 1;
            }
        }
        if(count<=1){
            return 1;
        }
        return 0;
    }
}