class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st=new ArrayDeque<>();
        int sum=0;
        for(String s:operations){
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+")) {
                int a=st.pop();
                int b=st.pop();
             
                st.push(b);
                st.push(a);
                st.push(a+b);
                
            }else{
                st.push(Integer.valueOf(s));
            }
        }

        while(!st.isEmpty()){
            sum +=st.pop();
        }

        return sum;
    }
}