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

     ArrayList<Integer> list = new ArrayList();
     HashMap<Integer,Integer> map = new HashMap();

    public int[] findMode(TreeNode root) {

        inorderTraverse(root);

        Set<Integer> keys = map.keySet();
        int maxFrequency = Integer.MIN_VALUE;
        for (Integer key : keys) {
            maxFrequency = Math.max(maxFrequency, map.get(key));
        }


        for (Integer key : keys) {
            if(map.get(key)== maxFrequency){
                list.add(key);
            }
        }


               int[] results = new int[list.size()];
               for(int i = 0; i<list.size(); i++ ){
                   results[i] = list.get(i);
               }

return results;




        
    }

    public void inorderTraverse(TreeNode currentNode){

        if(currentNode.left != null){
            inorderTraverse(currentNode.left);
        }
         map.put(currentNode.val,map.getOrDefault(currentNode.val,0)+1);
         if(currentNode.right != null){
            inorderTraverse(currentNode.right);
        }




    }
}