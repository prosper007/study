public class TreeNode {
    int num;
    TreeNode left;
    TreeNode right;

    TreeNode(int num){
        this.num = num;
    }
    public static void inOrderPrint(TreeNode t){
        if(t != null){
            inOrderPrint(t.left);
            System.out.println(t.num);
            inOrderPrint(t.right);
        }
    }
}
