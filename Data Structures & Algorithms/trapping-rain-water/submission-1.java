class Solution {
    public int trap(int[] height) {
        int n=height.length;

        if(n<=1) return 0;

        int i=0;
        
        int result=0;
        int area=0;
        int totalBar=0;
        while(height[i]<=height[i+1]&&i<n-1) i++;
        int j=i+1;
        while(j<n){
            if(height[i]>height[j]){
                totalBar +=height[j];
                j++;
            }else{
                totalBar +=height[i]*2;
                area=(j-i+1)*height[i];
                result +=area-totalBar;
                area=0;
                totalBar=0;
                i=j;
                j++;
            }
        }
        int end=i;
        area=0;
        totalBar=0;
        i=n-1;
        
        while(i<end&&height[i]<=height[i-1]) i--;
        j=i-1;
        while(j>=end){
            if(height[i]>height[j]){
                totalBar +=height[j];
                j--;
            }else{
                totalBar +=height[i]*2;
                area=(i-j+1)*height[i];
                result +=area-totalBar;
                area=0;
                totalBar=0;
                i=j;
                j--;
            }
        }
        return result;
    }
}
