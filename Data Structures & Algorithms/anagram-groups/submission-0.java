class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> temp=new ArrayList<>();
        List<String> li=new ArrayList<>();
        if(temp.size()==0){
                li.add(strs[0]);
                temp.add(li);
        }
        for(int i=1;i<strs.length;i++){
            
            int check=0;
            for(int j=0;j<temp.size();j++){
                
                  if(isAnagram(strs[i],temp.get(j).get(0))){
                    temp.get(j).add(strs[i]);
                    check++;
                  }
            }
            if(check==0){
                    List<String> yo=new ArrayList<>();
                    yo.add(strs[i]);
                    temp.add(yo);
            }
                
        }

        return temp;
    }

    boolean isAnagram(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
