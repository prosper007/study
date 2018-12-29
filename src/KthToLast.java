public class KthToLast {
    static int kthToLast(ListNode l1, int k){
        int len = 0;
        ListNode head = l1;
        while(l1 != null){
            len++;
            l1 = l1.next;
        }

        l1 = head;
        ListNode prev = l1;
        while (l1 != null){
            if(len == k){
                return l1.val;
            }
            len--;
            prev = l1;
            l1 = l1.next;
        }
        return -1;
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
        System.out.println(l1a.val);
        System.out.println();
        System.out.println(kthToLast(l1a, 3));
    }
}
