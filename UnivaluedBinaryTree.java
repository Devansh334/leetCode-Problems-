/*
A binary tree is uni-valued if every node in the tree has the same value.

Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

 

Example 1:


Input: root = [1,1,1,1,1,null,1]
Output: true
Example 2:


Input: root = [2,2,2,5,2]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 100].
0 <= Node.val < 100
*/

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

    public void show(TreeNode temp, Set<Integer> set){

        if(temp==null)return;
        show(temp.left,set);
        set.add(temp.val);
        show(temp.right,set);
    }
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        show(root,set);
        if(set.size()==1){
            return true;
        }
        return false;

    }
}
