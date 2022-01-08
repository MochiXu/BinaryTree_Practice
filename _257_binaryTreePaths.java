package BinaryTree;

import java.util.LinkedList;
import java.util.List;

//思想：左右拆分，使用递归函数
//做这个题目的时候刚开始无从下手，但是想了下可以拆分为左右子树，递归的对左右子树进行操作，最后就是对递归出口进行思考，
// 需要注意的是空结点的返回值
public class _257_binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();

        //出口函数
        //空结点
        if (root == null)
            return list;//一般为null的时候都会返回一个空的list
        //叶子结点
        if (root.left == null && root.right == null) {
            list.add("" + root.val);
            return list;
        }

        //递归函数
        List<String> list_left = binaryTreePaths(root.left);
        for (int i = 0; i < list_left.size(); i++)
            list_left.set(i, root.val + "->" + list_left.get(i));

        List<String> list_right = binaryTreePaths(root.right);
        for (int i = 0; i < list_right.size(); i++)
            list_right.set(i, root.val + "->" + list_right.get(i));

        list_left.addAll(list_right);
        return  list_left;
    }
}
