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
    public int maxLevelSum(TreeNode root) {
         if(root==null)
             return 0;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int j=1,t=1;
        int max=root.val;
        while(!q.isEmpty())
        {
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                sum=sum+curr.val;
                
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);                
            }
            if(sum>max)
            {
                max=sum;
                t=j;
            }
            j++;
        }
        return t;
        
    }
}