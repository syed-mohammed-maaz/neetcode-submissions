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
//use while and iterate till any of list is null and after then if any still pending add them as well
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode temp=head;
        while(list1!=null&&list2!=null){

            if(list1.val<=list2.val){
                temp.next=new ListNode(list1.val);
                temp=temp.next;
                list1=list1.next;
            }else{
                temp.next=new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;
            }
        }
        while(list1!=null){

            
                temp.next=new ListNode(list1.val);
                temp=temp.next;
                list1=list1.next;
            
        }
        while(list2!=null){

            
                temp.next=new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;
            
        }
        return head.next;
    }
}