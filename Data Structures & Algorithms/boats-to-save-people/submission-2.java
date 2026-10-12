class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int n=people.length;
        int sum=0;
        Arrays.sort(people);
        int i=0,j=n-1;
        while(i<=j){
            int weight=people[i]+people[j];
            if(weight<=limit){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }
        return count;
        
    }
}