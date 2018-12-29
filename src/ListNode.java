public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    void appendToTail(int d) {
        ListNode end = new ListNode(d);
         ListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    static void printList(ListNode l1){
        while (l1 != null){
            System.out.print(l1.val + " -> ");
            l1 = l1.next;
        }
    }
}