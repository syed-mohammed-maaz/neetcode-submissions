class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> h=new HashMap<>();
        //iterate array and store key vals in hashmap
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }

        //iterate the hashmap and store them in key Value as matrix
        List<List<Integer>> arr=new ArrayList<>(h.size());
        
        h.forEach((key,val)->{
            List<Integer> li=new ArrayList<>();
            li.add(key);
            li.add(val);
            arr.add(li);
        });

        //sort the matrix based on the result
       arr.sort(Comparator.comparingInt(a -> a.get(1)));

        //iteare and show till k
        int[] res=new int[k];
        int j=arr.size()-1;
        for(int i=0;i<k;i++){
            res[i]=arr.get(j).get(0);
            j--;
        }
        return res;
    }
}
