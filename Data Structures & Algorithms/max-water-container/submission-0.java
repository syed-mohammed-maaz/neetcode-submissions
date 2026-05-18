class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        double maxArea=0;
        for(int i=0;i<n-1;i++ ){
            int h=0;
            int b=0;
            
            for(int j=i+1;j<n;j++){
                h=Math.min(heights[i],heights[j]);
                b=j-i;
               
                maxArea=Math.max((b*h),maxArea);

            }
        }
        return (int) maxArea;
    }
}
