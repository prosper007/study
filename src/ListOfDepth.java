import java.util.ArrayList;

public class ListOfDepth {
    static ListNode listDepth(TreeNode treeNode, int depth){
        if(treeNode != null){
            ListNode l1 = new ListNode(treeNode.num);
            l1.next = listDepth(treeNode.left, depth+1);
            l1.next.next = listDepth(treeNode.right, depth+1);
        }
        return new ListNode(0);
    }


    public static void main(String[] args) {
        System.out.println(String.valueOf('*'));

    }
}
