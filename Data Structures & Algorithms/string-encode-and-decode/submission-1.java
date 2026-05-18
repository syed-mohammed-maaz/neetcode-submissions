class Solution {
    /**
    1.Create a stringBuilder &Iterate thorugh the list of strings 
    2.for each string gets it length and any char like " " and append it in stringBuilder
    3.then append each string like same way
    4.now for converting it to back just get the len of string by iterating 
    till u encounter " " and then storing the substring from ele after space to ele+length
    5.handle the incremen of i correctly for handling diff edge cases
    */

    public String encode(List<String> strs) {
        int n=strs.size();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++){
            s.append(strs.get(i).length());
            s.append(' ');
            s.append(strs.get(i));
        }

        return s.toString();
    }



    public List<String> decode(String str) {
        int i=0;
        int n=str.length();
        List<String> result=new ArrayList<>(); 
        while(i<n){
            int num=0;
            StringBuilder s=new StringBuilder();
            while(str.charAt(i)!=' '){
                s.append(str.charAt(i));
                i++;
            }
            i++;
            num=Integer.valueOf(s.toString());
            result.add(str.substring(i,i+num));
            i=i+num;
        }
        return result;
    }

}
