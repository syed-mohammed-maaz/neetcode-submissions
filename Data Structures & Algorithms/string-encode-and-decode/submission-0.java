class Solution {

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
            num=Integer.parseInt(s.toString());
            result.add(str.substring(i,i+num));
            i=i+num;
        }
        return result;
    }

}
