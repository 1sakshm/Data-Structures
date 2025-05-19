public class DeletePos {
    ListNode head;
    public ListNode deletePos(int position){
        if(position == 1){
            head=head.next;
        }
        ListNode previous = head;
        int count = 1;
        while(count < position - 1){
            previous = previous.next;
            count++;
        }
        previous.next = previous.next.next;
        return head;
    }
}
