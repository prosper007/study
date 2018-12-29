public class NoDupsLinkedList{
    static ListNode removeDups(ListNode l1){
        boolean[] found = new boolean[128];
        ListNode head = l1;
        ListNode prev = l1;
        while (l1 != null){
            if(found[l1.val]){
                prev.next = l1.next;
            }
            else{
                found[l1.val] = true;
            }
            prev = l1;
            l1 = l1.next;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode l1a = new ListNode(1);
        ListNode l1b = new ListNode(2);
        ListNode l1c = new ListNode(3);
        ListNode l1d = new ListNode(4);
        ListNode l1e = new ListNode(1);
        ListNode l1f = new ListNode(6);
        l1a.next = l1b;
        l1b.next = l1c;
        l1c.next = l1d;
        l1d.next = l1e;
        l1e.next = l1f;
        ListNode.printList(l1a);
        System.out.println();
        ListNode.printList(removeDups(l1a));
    }
}
