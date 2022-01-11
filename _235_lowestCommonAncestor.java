package BinaryTree;
//给定二叉搜索树，寻找两个结点的最近公共祖先
public class _235_lowestCommonAncestor {
    //思路：如果两个结点都在root的一侧子树上，那就将root移动到该子树，直到两个结点分别位于该root左右两侧
    //另外就是要利用到二叉搜索树的条件以及所有的结点值都是唯一的
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果根节点与p或者q任一结点一致，则返回null，这是根据第一次提交出错发现的。
        if(root==null) return null;
        if(root.val==p.val||root.val==q.val) return null;
        //如果root小于p和q，则说明p与q均在root的右侧
        if(root.val<p.val&&root.val<q.val) return lowestCommonAncestor(root.right,p,q);
        //如果root大于p和q，则说明p与q均在root的左侧
        if(root.val>p.val&&root.val>q.val) return lowestCommonAncestor(root.right,p,q);
        return root;

    }

}
