public class PrintNodes
{
    ListNode head;
    public void print()
    {
        ListNode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    
}

