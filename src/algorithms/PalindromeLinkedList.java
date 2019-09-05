package algorithms;

public class PalindromeLinkedList {

        public boolean isPalindrome(ListNode head) {
            if(head==null) return true;
            if(head.next==null) return true;
            ListNode dummy = head;
            ListNode newList = reverse(dummy);
            while(head!=null && newList!=null){
                if(head.val!=newList.val){
                    return false;
                }
                head=head.next;
                newList=newList.next;
            }
            return true;
        }

        private ListNode reverse(ListNode curr){
            if(curr==null || curr.next==null) return curr;
            ListNode nextNode=curr.next;
            curr.next=null;
            ListNode reversed=reverse(nextNode);
            nextNode.next=curr;
            return reversed;

    }
    public static class ListNode {
      int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

  public static void main(String args[]){
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = new ListNode(1);
      ListNode node2 = new ListNode(1);
      ListNode node3 = new ListNode(2);
      ListNode node4 = new ListNode(1);
      head.next =node2;
      node2.next=node3;
      node3.next=node4;

        palindromeLinkedList.isPalindrome(head);
  }
}
