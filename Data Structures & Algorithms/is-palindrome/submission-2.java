class Solution {
    /**
    Efficient (use 2 pointers starte and end)
    1.set the 2 pointers at start and end and make s to lowerCase
    2.iterate till start<end
    3.see if the char is digit Or letter and comapre both and if not same return false
    4.if not letter or digit then increment and decremenrt the pointer appropriately
    */
     public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char c1=s.charAt(start);
            char c2=s.charAt(end);
            if(!(Character.isLetterOrDigit(c1))){
                start++;
            }else if(!(Character.isLetterOrDigit(c2))){
                end--;
            }else{
                if(c1!=c2) return false;
                start++;
                end--;
            }
        }
        return true;
     }
    /**
    Reversing the string storing in copy and using isLetterOrDigit()
    1.reverse the string and store it in copy use stringBuilder reverse()
    2.mkae the chars as toLoweCase() for both string an dcopy
    3.now set 2 pointers and iterate till ny string gets finshed
    4.in each iteration see if char is digit or letter if no then increment the pointer
    5.if both char same then increment both and handle the return true and false
    isLetterOrDigit();
    */
    // public boolean isPalindrome(String s) {
    //     s=s.toLowerCase();
    //     StringBuilder temp=new StringBuilder(s);
    //     temp.reverse();
    //     String copy=temp.toString().toLowerCase();
    //     int i=0,j=0;

    //     while(i<s.length()&&j<copy.length()){
    //         if(!(Character.isLetterOrDigit(s.charAt(i)))){
    //             i++;
    //         }else if(!(Character.isLetterOrDigit(copy.charAt(j)))){
    //             j++;
    //         }else{
    //             if(s.charAt(i)!=copy.charAt(j)) return false;
    //             i++;
    //             j++;
    //         }
    //     }
    //     return true;
    // }
    /**
    Brute Force
    1.Create a hashSet of all alphabets and numbers
    2.now iterate the string and append all alphabtes and numbers ignoring other chars in syringBuilder
    3.now call the checkPaliendrome where set 2 ointers to start and end and see if both have have char
    and incremant and decrement accordinglty
    */
    // public boolean isPalindrome(String s) {
    //     //create a hashset
    //     String temp="abcdefghijklmnopqrstuvwxyz0123456789";
    //     Set<Character> alpha=new HashSet<>();
    //     for(int i=0;i<36;i++){
    //         alpha.add(temp.charAt(i));
    //     }

    //     StringBuilder result=new StringBuilder();
    //     s=s.toLowerCase();

    //     //now create a final string
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         if(alpha.contains(ch)){
    //             result.append(ch);
    //         }
    //     }

    //     return checkPalindrome(result,0,result.length()-1);
    // }

    // boolean checkPalindrome(StringBuilder s,int start,int end){
    //     while(start<end){
    //         if(s.charAt(start)!=s.charAt(end))  return false;
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }
}