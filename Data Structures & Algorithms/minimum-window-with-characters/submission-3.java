// class Solution {
//     public String minWindow(String s, String t) {
//         int n=s.length();
//         int m=t.length();
//         Map<Character,Integer> map1=new HashMap<>();
//         for(int i=0;i<m;i++){
//             map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
//         }
//         String minStr="";
//         int min=Integer.MAX_VALUE;
        
//         for(int i=0;i<n;i++){
//             Map<Character,Integer> map2=new HashMap<>();
           
         
//             for(int j=i;j<n;j++){
//                 map2.put(s.charAt(j),map2.getOrDefault(s.charAt(j),0)+1);
//                 int count=0;
//                 for(Map.Entry<Character,Integer> entry:map1.entrySet()){
                    
//                     if(entry.getValue()<=map2.getOrDefault(entry.getKey(),0)){
//                        count++;
//                     }
//                 }
//                 if(count==map1.size()&&j-i+1<min){
//                     min=j-i+1;
//                     minStr=s.substring(i,j+1);
//                 }
                    
                    
                   
                
//             }
//         }


//         return minStr;
//     }
// }

class Solution {
    public String minWindow(String s, String t) {
        int min=Integer.MAX_VALUE;
        String minStr="";
        int n=s.length();
        int m=t.length();
        if(m>n) return "";
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        int x=0,y=m-1;
        //store map vals
        for(int i=0;i<m;i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);

        }

        
        while(y<n){
            //check maps
            int z=0;
            for(Map.Entry<Character,Integer> entry:map1.entrySet()){
                if(entry.getValue()<=map2.getOrDefault(entry.getKey(),0)){
                    z++;
                }else{
                    break;
                }
            }

            if(z==map1.size()){ 
              
               
                    if((y-x+1)<min){
                        min=y-x+1;
                        minStr=s.substring(x,y+1);
                     }
                    if(map2.get(s.charAt(x))==1){
                         map2.remove(s.charAt(x));
                    }else{
                        map2.put(s.charAt(x),map2.get(s.charAt(x))-1);
                    }
                     x++;

            }else{
                y++;
                if(y<n)map2.put(s.charAt(y),map2.getOrDefault(s.charAt(y),0)+1);

            }
        }
       


        return minStr;
    }
}
