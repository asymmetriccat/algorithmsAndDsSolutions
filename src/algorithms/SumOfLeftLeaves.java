package algorithms;

public class SumOfLeftLeaves {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

    public int sumOfLeftLeaves(TreeNode root){
        if(root==null) return 0;
        int sum=0;
        if(root.left!=null){
            if(root.left.left==null&&root.left.right==null){
                sum+=root.left.val;
            }
            else sum+=sumOfLeftLeaves(root.left);
        }
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }

    public static void main(String args[]){
        TreeNode treeNode=new TreeNode(1);
        TreeNode l1=new TreeNode(3);
        treeNode.left=l1;
        TreeNode r1=new TreeNode(4);
        treeNode.right=r1;
        TreeNode l2=new TreeNode(6);
        l1.left=l2;


        SumOfLeftLeaves sumOfLeftLeaves=new SumOfLeftLeaves();
        int result=sumOfLeftLeaves.sumOfLeftLeaves(treeNode);
        System.out.println(result);



    }

}
