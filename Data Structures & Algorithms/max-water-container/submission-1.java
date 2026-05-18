// class Solution {
//     public int maxArea(int[] heights) {
//         int n=heights.length;
//         double maxArea=0;
//         for(int i=0;i<n-1;i++ ){
//             int h=0;
//             int b=0;
            
//             for(int j=i+1;j<n;j++){
//                 h=Math.min(heights[i],heights[j]);
//                 b=j-i;
               
//                 maxArea=Math.max((b*h),maxArea);

//             }
//         }
//         return (int) maxArea;
//     }
// }
//efficient using 2 pointers

class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=n-1;
        while(l<r){
            int h1=heights[l];
            int h2=heights[r];
            max=Math.max(Math.min(h1,h2)*(r-l),max);
            if(h1<h2) l++;
            else r--;
        }
        return max;
    }
}
