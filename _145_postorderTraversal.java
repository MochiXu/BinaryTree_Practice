package BinaryTree;

import java.util.LinkedList;
import java.util.List;
//二叉树后续遍历
//先访问中，再入左，右，出栈是先右左，访问是中右左，最后再反转。
public class _145_postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack=new LinkedList<>();
        List<Integer> list_val=new LinkedList<>();
        //边界判断
        if(root==null) return list_val;
        //处理根节点
        list_val.add(root.val);
        if(root.left!=null)stack.add(root.left);
        if(root.right!=null)stack.add(root.right);

        while (stack.size()!=0){
            TreeNode treeNode=stack.getLast();
            stack.removeLast();
            //访问栈顶结点
            list_val.add(treeNode.val);
            //入栈
            if(treeNode.left!=null)stack.add(treeNode.left);
            if(treeNode.right!=null)stack.add(treeNode.right);
        }

        List<Integer> list_re=new LinkedList<>();
        for(int i=list_val.size()-1;i>=0;i--) list_re.add(list_val.get(i));
        return list_re;
    }

}
