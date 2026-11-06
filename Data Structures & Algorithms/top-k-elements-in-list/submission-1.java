class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a))
);
        for (int num : map.keySet()) {
    pq.offer(num);
}
int[]ans=new int[k];
for(int i=0;i<k;i++){
    ans[i]=pq.poll();
}return ans;
    }
}
