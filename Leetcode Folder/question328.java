class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenHead = even;

        while(odd.next!=null && even.next!=null){
            //odd builder
            odd.next = even.next;
            odd = odd.next;

            //even builder
            even.next = odd.next;
            even = even.next;
        }

        //append even list onto odd list
        odd.next = evenHead;

        return head;
    }
}

//builder logic
//odd.next = even.next
//even.next will be an odd number
//odd.next = On odd we will append the next odd number
//We move our head onto our next value, even.next (it was placed in front of odd)
