class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int l=0;
        int r=n-1;
        int mid=0;
        for(int i=0;i<n;i++){
            l=0;
            r=matrix[i].length-1;
            while(l<=r){
                mid=(l+r)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(target<matrix[i][mid]){
                   r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return false;
    }
}
