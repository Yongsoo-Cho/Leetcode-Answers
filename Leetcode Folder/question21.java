class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode ref = res;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){ //list1 is less than list 2
                res.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{ //list2 is less than list 1
                res.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            res = res.next;
        }

        //EQUAL VALUES
        while(list1!=null){
            res.next = new ListNode(list1.val);

            list1 = list1.next;
            res = res.next;
        }

        while(list2!=null){
            res.next = new ListNode(list2.val);

            list2 = list2.next;
            res = res.next;
        }

        return ref.next;
    }
}
