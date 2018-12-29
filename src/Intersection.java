import java.util.ArrayList;

public class Intersection {
    static ListNode intersection(ListNode l1, ListNode l2){
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (l1 != null){
            listNodes.add(l1);
            l1 = l1.next;
        }
        while (l2 != null){
            if(listNodes.contains(l2)){
                return l2;
            }
            l2 = l2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l1a = new ListNode(2);
        ListNode l1b = new ListNode(4);
        ListNode l1c = new ListNode(3);
        l1.next = l1a;
        l1a.next = l1b;


        ListNode l2a = new ListNode(5);
        ListNode l2b = new ListNode(6);
        ListNode l2c = new ListNode(7);
        ListNode d = new ListNode(9);
        ListNode e = new ListNode(13);
        l1b.next = l2c;
        l2a.next = l2b;
        l2b.next = l2c;
        l2c.next = d;
        d.next = e;
        ListNode.printList(l1);
        System.out.println();
        ListNode.printList(l2a);
        System.out.println();
        ListNode.printList(intersection(l1a, l2a));
    }
}
