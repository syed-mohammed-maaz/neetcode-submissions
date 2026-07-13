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
    1.here we just have to do addtion for both LL and store in result LL
    2.start from left and go for right since its reverse and we can do addition from left to right
    3.create a sum which adds val of LL1&LL2 and carry
    4.carry is default 0 and if sum is >9 then carry is sum/ 10 and result val is sum mod 10
    5.else carry is 0 and result val is sum
    6.Handle EDGE CASES:iterate while any one LL is not null or carry is >0
    7.so null has no val so if any LL node is null give its val as 0
    8.while updating LL next node make sure if current is not null
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

    //     //2nd attempt
    //     int carry=0;
     
    //     ListNode dummy=new ListNode(0);
    //     ListNode t1=l1,t2=l2,temp=dummy;

    //     while(t1!=null||t2!=null){
    //         ListNode newNode;
    //         int sum;
    //         if(t1!=null&&t2!=null)sum=carry+t1.val+t2.val;
    //         else if(t2!=null)sum=carry+t2.val;
    //         else  sum=carry+t1.val;
    //         if(sum<10){
    //             newNode=new ListNode(sum);
    //             carry=0;
    //         }else{
    //             newNode=new ListNode(sum%10);
    //             carry=sum/10;
    //         }
    //         temp.next=newNode;
    //         temp=temp.next;
    //         if(t1!=null) t1=t1.next;
    //        if(t2!=null) t2=t2.next;
    //     }

    //     while(carry!=0){
    //         ListNode newNode;
    //         if(carry<10){
    //             newNode=new ListNode(carry);
    //             carry=0;
    //         }else{
    //             newNode=new ListNode(carry%10);
    //             carry /=10;
    //         }
    //         temp.next=newNode;
    //          temp=temp.next;
    //     }
        
    //     return dummy.next;
    }
}
