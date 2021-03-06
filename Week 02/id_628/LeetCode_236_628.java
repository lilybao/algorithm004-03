//给定一个 N 叉树，返回其节点值的后序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其后序遍历: [5,6,3,2,4,1]. 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class LeetCode_590_628 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(res,root);
        return res;
    }

    public void dfs(List<Integer> reslist , Node root){
        if(root == null) return ;
        if(root.children != null && root.children.size() != 0){
            for (Node node:root.children) {
                dfs(reslist , node);
            }
        }
        reslist.add(root.val);
        return ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
