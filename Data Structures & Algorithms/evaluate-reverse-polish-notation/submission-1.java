class Solution {
    /**
    Using stack
    1.storing the vals and performing iif any operand occurs
    2.iterate the array and 
    -->if element is integer push it in stack by 
    converting string to integer(Integer.valueOf(val_string))
    -->a)if the element is an operand (+,-,or *) then pop the stack twice 
    and store their values
    -->b)now use swith case and based on operand perform the operation 
        (n2 operation n1)//because n2 stores first element
    3.Now return the result by popping the stack

    TIP:if if the postfix expression then  reverse the array 
    treat n1 and n2 inversely
    */
    public int evalRPN(String[] tokens) {


        Stack<Integer> st=new Stack<>();

        for(String i:tokens){
            int res,n1,n2;
            if(i.equals("+")){
                n2=st.pop();
                n1=st.pop();
                res=n1+n2;
                st.push(res);
            }else if(i.equals("-")){
                 n2=st.pop();
                n1=st.pop();
                res=n1-n2;
                st.push(res);
                
            }else if(i.equals("*")){
                 n2=st.pop();
                n1=st.pop();
                res=n1*n2;
                st.push(res);
                
            }else if(i.equals("/")){
                 n2=st.pop();
                n1=st.pop();
                res=n1/n2;
                st.push(res);
            }else{
                int num=Integer.parseInt(i);
                st.push(num);
            }
        }
        return st.pop();












        // int n=tokens.length;
        // Deque<Integer> stack=new ArrayDeque<>();
        // int result=0;int n1=0;int n2=0;
        // for(int i=0;i<n;i++){
        //     String val=tokens[i];
        //     if(val.equals("*")||val.equals("/")||val.equals("-")||val.equals("+")){
        //         n1=stack.pop();
        //         n2=stack.pop();
        //         switch(val){
        //             case "*":   result=n2*n1;
        //                         break;
        //              case "/":   result=n2/n1;
        //                         break;
        //              case "+":   result=n2+n1;
        //                         break;
        //              case "-":   result=n2-n1;
        //                         break;
        //         }
        //         stack.push(result);
        //     }else{
        //         stack.push(Integer.valueOf(val));
        //     }
        // }
        // return stack.pop();
    }
}
