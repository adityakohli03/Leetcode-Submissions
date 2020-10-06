/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> list =new ArrayList<>();
            
            for(int i=0;i<count;i++){
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            result.add(list);
        }
        List<List<Integer>> reverseResult = new ArrayList<>();
        for(int i=(result.size())-1;i>=0;i--)
        {
            reverseResult.add(result.get(i));
        }
        return reverseResult;
    }
}