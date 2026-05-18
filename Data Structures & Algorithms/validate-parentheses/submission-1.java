class Solution {
    public boolean isValid(String s) {
        //take each char if [{ or (  then if ]}or)pop the stack 
        //after popping see if the current val and pooped char matches if not then return false
        //if len is greater than 0 at end then also return false
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='{'||c=='['||c=='('){
                stack.push(c);
            }else if(c=='}'||c==']'||c==')'&&stack.size()>0){
                if(stack.size()==0) return false;
                char temp=stack.pop();
                if(c=='}'&&temp!='{'||c==')'&&temp!='('||c==']'&&temp!='['){
                    return false;
                }
            }else{
                return false;
            }
        }

        if(stack.size()>0) return false;
        return true;
    }  
}
