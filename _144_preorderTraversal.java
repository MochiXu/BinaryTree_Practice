package BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class _144_preorderTraversal {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list=new LinkedList<>();
//        preo(root,list);
//        return list;
//    }
//    public void preo(TreeNode root,List list){
//        if (root!=null){
//            list.add(root.val);
//            preo(root.left,list);
//            preo(root.right,list);
//        }else return;
//    }
public List<Integer> preorderTraversal(TreeNode root) {
    //使用迭代
    LinkedList<TreeNode> stack=new LinkedList<>();
    List<Integer> list=new LinkedList<>();

    if(root==null)
        return list;
    //将左侧依次入栈
    while (root!=null){
        stack.add(root);
        list.add(root.val);
        root=root.left;
    }
    while (stack.size()!=0){
        TreeNode tempNode=stack.getLast();
        stack.removeLast();

        //如果有右孩子，那就加入右孩子的左子树
        TreeNode node=tempNode.right;
        while (node != null) {
            stack.add(node);
            list.add(node.val);

            node = node.left;
        }
    }
    return list;
}
}
