class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        //create a copy and store sorted strings in there
        String[] copy=Arrays.copyOf(strs,n);
        for(int i=0;i<n;i++){
            StringBuilder s=new StringBuilder();
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            for(int m=0;m<c.length;m++){
                s.append(c[m]);
            }

            copy[i]=s.toString();
        }

        //create a hashmap and store the vals
        Map<String,List<Integer>> h=new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> arr=new ArrayList<>();
            
            arr=h.getOrDefault(copy[i],arr);
            arr.add(i);
            h.put(copy[i],arr);
        }

        //iterate the hasmap and store the val of indices in result which is a matrix
        List<List<String>> result=new ArrayList<>();
     

        h.forEach((key,val)->{
           List<String> temp=new ArrayList<>();
            for(int k=0;k<val.size();k++){
                temp.add(strs[val.get(k)]);
            }
            result.add(temp);
    });

        return result;
    }
    // public List<List<String>> groupAnagrams(String[] strs) {
    //      List<List<String>> temp=new ArrayList<>();
    //     List<String> li=new ArrayList<>();
    //     if(temp.size()==0){
    //             li.add(strs[0]);
    //             temp.add(li);
    //     }
    //     for(int i=1;i<strs.length;i++){
            
    //         int check=0;
    //         for(int j=0;j<temp.size();j++){
                
    //               if(isAnagram(strs[i],temp.get(j).get(0))){
    //                 temp.get(j).add(strs[i]);
    //                 check++;
    //               }
    //         }
    //         if(check==0){
    //                 List<String> yo=new ArrayList<>();
    //                 yo.add(strs[i]);
    //                 temp.add(yo);
    //         }
                
    //     }

    //     return temp;
    // }

    boolean isAnagram(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
