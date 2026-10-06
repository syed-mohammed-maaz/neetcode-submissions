class Solution {
    //brute force
    public int largestRectangleArea(int[] heights) {
        int max=0;
        Deque<int[]> st=new ArrayDeque<>();
      int n=heights.length;
      int[] arr=new int[2];
      
      for(int i=0;i<n;i++){
        if(st.isEmpty()||st.peek()[1]<=heights[i]){
            st.push(new int[]{i,heights[i]});
        }else{
            
            while(!st.isEmpty()&&st.peek()[1]>heights[i]){
                max=Math.max(max,(i-st.peek()[0])*(st.peek()[1]));
                arr=st.pop();

            }
            st.push(new int[]{arr[0],heights[i]});

        }
      }

      while(!st.isEmpty()){
        max=Math.max(max,(n-st.peek()[0])*(st.pop()[1]));
      }
      return max;
    }
}
