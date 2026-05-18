class Solution {
    // public int[] productExceptSelf(int[] nums) {
    //     int n=nums.length;
    //     int[] result=new int[n];
    //     for(int i=0;i<n;i++){
    //         int product=1;
    //         for(int j=0;j<n;j++){
    //             if(i!=j){
    //                 product *=nums[j];
    //             }
    //         }
    //         result[i]=product;
    //     }
    //     return result;
    // }

    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        //final result return
        int[] result=new int[n];

        //prefixx mul
        int[] suff=new int[n];

        //suffix mul
        int[] pre=new int[n];

        int prePro=1;
        int sufPro=1;

        //prefix product
        for(int i=0;i<n;i++){
            prePro *=nums[i];
            pre[i]=prePro;
        }

        //suffix product
        for(int i=n-1;i>=0;i--){
            sufPro *=nums[i];
            suff[i]=sufPro;
        }

        int p=0;
        int s=0;


        for(int i=0;i<n;i++){
            int val1=1;
            int val2=1;
            p=i-1;
            s=i+1;
            if(p>=0) val1=pre[p];
            if(s<n) val2=suff[s];

            result[i]=val1*val2;
        }

        return result;
    }
}