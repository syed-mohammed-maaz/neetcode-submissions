class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Deque<Integer> stack=new ArrayDeque<>();
        int result=0;int n1=0;int n2=0;
        for(int i=0;i<n;i++){
            String val=tokens[i];
            if(val.equals("*")||val.equals("/")||val.equals("-")||val.equals("+")){
                n1=stack.pop();
                n2=stack.pop();
                switch(val){
                    case "*":   result=n2*n1;
                                break;
                     case "/":   result=n2/n1;
                                break;
                     case "+":   result=n2+n1;
                                break;
                     case "-":   result=n2-n1;
                                break;
                }
                stack.push(result);
            }else{
                stack.push(Integer.valueOf(val));
            }
        }
        return stack.pop();
    }
}
