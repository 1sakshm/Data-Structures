public class Find {
    ListNode head;
    public boolean find(int value){
        ListNode current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
