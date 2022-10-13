class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode prev=head;
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
        }
        prev.next=prev.next.next;
        return head;
    }
}
