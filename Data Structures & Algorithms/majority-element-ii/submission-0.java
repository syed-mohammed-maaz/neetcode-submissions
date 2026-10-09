class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;

        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/3) arr.add(entry.getKey());
        }

        return arr;
    }
}