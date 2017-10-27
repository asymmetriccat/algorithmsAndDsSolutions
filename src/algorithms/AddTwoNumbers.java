package algorithms;
/*
   You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry=0;
        ListNode resultHeader=new ListNode(0);
        ListNode ln1=l1, ln2=l2, current=resultHeader;
        while(ln1!=null||ln2!=null){
            int v1=(ln1!=null)?ln1.val:0;
            int v2=(ln2!=null)?ln2.val:0;
            int sum=v1+v2+carry;
            current.next=new ListNode(sum%10);
            current=current.next;
            carry=sum/10;
            if(ln1!=null)ln1=ln1.next;
            if(ln2!=null)ln2=ln2.next;
        }
        if(carry>0)current.next=new ListNode(carry);
        return resultHeader.next;
    }

}
