public class CheckBalanced {
    static boolean checkBalanced(TreeNode treeNode){
        if(treeNode == null){
            return true;
        }
        int heightOfLeft = getHeight(treeNode.left);
        int heightOfRight = getHeight(treeNode.right);
        if(Math.abs(heightOfLeft - heightOfRight) >1){
            return false;
        }
        checkBalanced(treeNode.left);
        checkBalanced(treeNode.right);
        return true;
    }
    static int getHeight(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        return Math.max(getHeight(treeNode.right)+1, getHeight(treeNode.left)+1);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode4.right = treeNode5;
        System.out.println(checkBalanced(treeNode));
        System.out.println(false && false);


    }

}
