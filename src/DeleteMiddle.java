public class DeleteMiddle {
    static boolean deleteMiddle(ListNode l){
        if(l == null || l.next == null){
            return false;
        }
        ListNode next = l.next;
        l.val = next.val;
        l.next = next.next;
        return true;
    }

    public static void main(String[] args) {
        ListNode l1a = new ListNode(1);
        ListNode l1b = new ListNode(2);
        ListNode l1c = new ListNode(3);
        ListNode l1d = new ListNode(4);
        ListNode l1e = new ListNode(5);
        ListNode l1f = new ListNode(6);
        l1a.next = l1b;
        l1b.next = l1c;
        l1c.next = l1d;
        l1d.next = l1e;
        l1e.next = l1f;
        ListNode.printList(l1a);
        System.out.println();
        deleteMiddle(l1c);
        ListNode.printList(l1a);
    }
}
