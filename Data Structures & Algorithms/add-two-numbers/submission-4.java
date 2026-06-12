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

//iterate through the linked list from head and get integer for both llist
//to get int just do val into 10 plus the node val
//to reverse the num just divide the num and store rem by multiply by 10 plus rem
//now convert it to stringbulider and reverse it and create a node and return it
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int a=0;
//         int b=0;
//         int num1=0,num2=0;
//         ListNode temp=l1;
//         while(temp!=null){
//             a=a*10+temp.val;
//             temp=temp.next;
//         }

//         temp=l2;
//         while(temp!=null){
//             b=b*10+temp.val;
//             temp=temp.next;
//         }

//         //reverse both nums and store it in num1 and num2
//         while(a>0){
//             num1 =(num1*10)+(a%10);
//             a /=10;
//         }

//         while(b>0){
//             num2 =(num2*10)+(b%10);
//             b /=10;
//         }

//         int sum=num1+num2;
        
   
//         ListNode result=new ListNode(sum%10);
//         sum /=10;
//         temp=result;
//         while(sum>0){
//             ListNode newNode=new ListNode(sum%10);
//             sum /=10;
//             temp.next=newNode;
//             temp=temp.next;
            
//         }
//         return result;
//     }
// }
class Solution {
    /**
    1.create an array
    2.now iterate the LL till one both are null(if any one becomes null then just start taking val as 0)
    3.if temp.next is null then store 
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0,carry=0,val1=0,val2=0;
        ListNode temp1=l1;
        ListNode temp2=l2;

        ListNode result=new ListNode(0);
        ListNode temp=result;
        while(temp1!=null||temp2!=null||carry>0){
            val1=(temp1==null)?0:temp1.val;
            val2=(temp2==null)?0:temp2.val;
            sum=carry+val1+val2;
            ListNode newNode;
            if(sum>9){
                newNode=new ListNode(sum%10);
                carry=sum/10;
            }else{
               newNode=new ListNode(sum);
                carry=0;
            }
            if(temp1!=null)temp1=temp1.next;
            if(temp2!=null)temp2=temp2.next;
            temp.next=newNode;
            temp=temp.next;
        }
        return result.next;
    }
}
