import java.util.Stack;

public class LinkedPalindrome {
    static boolean palindrome(ListNode l){
        ListNode reversed = reverse(l);
        return isEqual(l, reversed);
    }

    static ListNode reverse(ListNode l){
        ListNode head = null;
        ListNode node = null;
        while (l != null){
            ListNode n = new ListNode(l.val);
            n.next = node;
            head = n;
            node = n;
            l = l.next;
        }
        return head;
    }

    static boolean isEqual(ListNode l1, ListNode l2){
        while (l1 != null){
            if(l1.val != l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l1a = new ListNode(1);
        ListNode l1b = new ListNode(2);
        ListNode l1c = new ListNode(3);
        ListNode l1d = new ListNode(3);
        ListNode l1e = new ListNode(2);
        ListNode l1f = new ListNode(1);
        l1a.next = l1b;
        l1b.next = l1c;
        l1c.next = l1d;
        l1d.next = l1e;
        l1e.next = l1f;
        System.out.println(palindrome(l1a));
    }
}
