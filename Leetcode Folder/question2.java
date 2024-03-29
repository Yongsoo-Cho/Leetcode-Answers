class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ref = new ListNode(0);
        ListNode head = new ListNode(0);
        ref = head;

        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                carry += l2.val;
                l2 = l2.next;
            }
            head.next = new ListNode(carry%10); //ones place
            carry /= 10; //int are truncated
            head = head.next;
        }

        return ref.next;
    }
}
