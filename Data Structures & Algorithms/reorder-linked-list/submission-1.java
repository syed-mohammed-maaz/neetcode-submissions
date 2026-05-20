/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        //iterate and store  in array
        //find mid
        //create another array of n
        //iterate from 0 to mid and store the ele in odd even indices
        //from from n-1 to mid store in even indices
        List<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int n=arr.size();
        ListNode[] result=new ListNode[n];
        int mid=n/2;
        if(n%2!=0) mid++;

        for(int i=0,j=0;i<mid;i++,j=j+2){
            result[j]=arr.get(i);
        }
        for(int i=n-1,j=1;i>=mid;i--,j=j+2){
           result[j]=arr.get(i);
        }

        head=result[0];
        temp=head;
        int k=0;
        for(int i=1;i<n;i++){
            temp.next=result[i];
            temp=temp.next;
        }
        temp.next=null;

    }
}
