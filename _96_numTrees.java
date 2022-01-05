package BinaryTree;

public class _96_numTrees {
    public static void main(String args[]){
        _96_numTrees __96=new _96_numTrees();
        System.out.println(__96.numTrees(3));
    }
    public int numTrees(int n) {
       return generateTree(1,n);
    }

    public int generateTree(int start, int end) {
        int ans=0;
        if (start > end)
            return 0;
        if (start == end)
            return 1;
        for(int i=start;i<=end;i++){
            int left_num=generateTree(start,i-1);
            int right_num=generateTree(i+1,end);
            //三元表达式是一个函数值
            ans=(left_num==0||right_num==0)?(ans+left_num+right_num) : (ans+left_num*right_num);
        }
        return ans;
    }
}
