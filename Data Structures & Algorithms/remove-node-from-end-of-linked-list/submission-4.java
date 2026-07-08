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

/**
1.iterate and count the no. of nodes
2.now find the node which has to be delete by doing index=count-n
3.now if first elemnet has to be removed then just do head=head.next else
4.keep track of prev node and currnt node and delte the current node
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        ListNode dummy=new ListNode(0,head);
          ListNode right=head,left=dummy;

        // if(head==null||head.next==null) return null;
        while(n>0){
            n--;
            right=right.next;
        } 

        while(right!=null){
            left=left.next;
            right=right.next;
        }

        left.next=left.next.next;
        return dummy.next;
        
        // int count=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
        // }

        // int index=count-n;
        
        // temp=head;
        // ListNode prev=temp;
        // count=0;
        // while(temp!=null&&count!=index){
        //     count++;
        //     prev=temp;
        //     temp=temp.next;
        // }
        // if(count==0) {
        //     head=head.next;
        //     return head;
        // }
        // prev.next=temp.next;
        // return head;
        
    }
}
