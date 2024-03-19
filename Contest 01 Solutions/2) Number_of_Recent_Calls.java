class RecentCounter {
    Queue<Integer> que;

    public RecentCounter() {
        que = new LinkedList<>();
    }
    
    public int ping(int t) {
        while(!que.isEmpty() && que.peek()<t-3000){
            que.poll();
        }
        que.offer(t);
        return que.size();
    }
}
