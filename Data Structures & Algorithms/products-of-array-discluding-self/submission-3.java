class Solution {

    /*
    Using prefix and suffix product array
    1.create an array for prefix and suffix product and result
    2.now fill the prefix from 0 to nand suffix from n-1 to 0
    3.now iterate the nums and for each i take its previous index prefix
    and its next index suffix and multiply thier vals and store in result
    4.Handle edge case where if its less than 0 or equal to n then the val is 1
    (prefixIndex=i-1) &(suffixindex=i+1)
    */
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