class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                count+=map.get(i);
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return count;
    }
}