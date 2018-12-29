import java.util.ArrayList;

class Solution {
    private static ListNode compress(ListNode l1, ListNode l2) {
        int sum;
        int tens;
        int units;
        int carry = 0;
        ListNode result = new ListNode(0);
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            units = sum % 10;
            result = new ListNode(units);
            //result.val = sum;
            result = result.next;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        return result;

    }


    public static void main(String[] args) {
        ListNode l1a = new ListNode(2);
        ListNode l1b = new ListNode(4);
        ListNode l1c = new ListNode(3);
        l1a.next = l1b;
        l1b.next = l1c;
        ListNode l2a = new ListNode(5);
        ListNode l2b = new ListNode(6);
        ListNode l2c = new ListNode(4);
        l2a.next = l2b;
        l2b.next = l2c;
        System.out.println(compress(l1a, l2a));
        double test = (double)3/2;
        System.out.println(test);
    }
}
