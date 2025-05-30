public class Reverse {
    ListNode head;
    public ListNode reverse(){
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;   
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}