class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0,x=0;
        Deque<Integer> dq=new ArrayDeque<>();
        int[] arr=new int[n-k+1];

        while(j<k){
            while(!dq.isEmpty()&&nums[dq.getLast()]<nums[j]) dq.removeLast();
            dq.addLast(j++);
            
        }
        arr[x++]=nums[dq.getFirst()];
        

        while(j<n){
            if(i==dq.getFirst()) dq.removeFirst();
            while(!dq.isEmpty()&&nums[dq.getLast()]<nums[j]) dq.removeLast();
            dq.addLast(j);
            arr[x++]=nums[dq.getFirst()];

            i++;
            j++;
        }


        return arr;

    }
}