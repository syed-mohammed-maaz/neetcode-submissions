class Node{
    int val;
    Node next;
    Node(int v){
        val=v;
        next=null;
    }
}
class Solution {
    
    public int findDuplicate(int[] nums) {
        // brute force using a set and returning the repeated val
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }

        return -1;
        // Node dummy=new Node(0);
        // Node temp=dummy;
        // for(int i:nums){
        //     Node n=new Node(i);
        //     temp.next=n;
        //     temp=temp.next;
        // }


        

    }
}
