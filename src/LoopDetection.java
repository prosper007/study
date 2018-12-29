import java.util.ArrayList;
import java.util.Stack;

public class LoopDetection {
    static ListNode detectLoop(ListNode l){
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while(l != null){
            if(listNodes.contains(l)){
                return l;
            }
            else {
                listNodes.add(l);
            }
            l = l.next;
        }
        return null;
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
        l1e.next = l1c;
        System.out.println(detectLoop(l1a).val);

        //ListNode.printList(l1a);

    }
}
