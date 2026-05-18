class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    
        int n=temperatures.length;
        int[] result=new int[n];

        Deque<Integer> st=new ArrayDeque<>();
   
        for(int i=0;i<n;i++){
            int curEle=temperatures[i];
            if(st.isEmpty()||temperatures[st.peek()]>=curEle){
                st.push(i);
            }else{
                while(!(st.isEmpty())&&temperatures[st.peek()]<curEle){
                    int index=st.pop();
                    result[index]=i-index;
                }
                st.push(i);
            }
        }
        return result;
    }
}

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
    
//         int n=temperatures.length;
//         int[] result=new int[n];
//         int m=0;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(temperatures[j]>temperatures[i]){
//                     result[m++]=j-i;
//                     break;            
//                 }else if(j==n-1){
//                     result[m++]=0;
                 
//                 }
//             }
//         }
//         // result[m++]=0;
//         return result;
//     }
// }
