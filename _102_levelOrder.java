package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//该题的主要思路就是在二叉树层序遍历的时候对各个结点深度进行标记
//从而在输出的时候可以根据深度输出
public class _102_levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new LinkedList<>();
        //边界判断
        if(root==null)
            return lists;

        //设置两个List，分别用于记录层结点、结点深度&值
        LinkedList<TreeNode> list_node=new LinkedList<>();
        LinkedList<int[]> list_val_index=new LinkedList<>();

        //根节点入队,并更新val_index
        list_node.add(root);
        list_val_index.add(new int[]{root.val,0});
        int k=0,j=0;
        //开始层序遍历
        while (list_node.size()!=0){
            //找到队首结点出队
            TreeNode node_temp=list_node.getFirst();
            list_node.removeFirst();
            //访问队首结点的左右孩子，将它们入队并填充它们的深度
            k=list_val_index.get(j++)[1];

            if(node_temp.left!=null){
                list_node.add(node_temp.left);
                list_val_index.add(new int[]{node_temp.left.val, k + 1});
            }
            if(node_temp.right!=null){
                list_node.add(node_temp.right);
                list_val_index.add(new int[]{node_temp.right.val, k + 1});
            }
        }

        //输出
        for (int i=0;i<=k+1;i++){
            List<Integer> list=new ArrayList<>();
            while (list_val_index.size()!=0&&list_val_index.getFirst()[1]==i){
                list.add(list_val_index.getFirst()[0]);
                list_val_index.removeFirst();
            }
            if (list.size()!=0)
                lists.add(list);
        }
        return lists;
    }

}
