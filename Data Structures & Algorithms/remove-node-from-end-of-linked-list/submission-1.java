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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int index=count-n;
        
        temp=head;
        ListNode prev=temp;
        count=0;
        while(temp!=null&&count!=index){
            count++;
            prev=temp;
            temp=temp.next;
        }
        if(count==0) {
            head=head.next;
            return head;
        }
        prev.next=temp.next;
        return head;
    }
}
